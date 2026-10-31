package com.power.doc.increment;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.power.doc.utils.ApiConfigUtils;
import io.github.smartdoc.builder.openapi.OpenApiBuilder;
import io.github.smartdoc.model.ApiConfig;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Regression test for the incremental build: the first incremental build must
 * persist the dependency tree together with the latest commit id.
 */
public class IncrementBuildTest {

    private static final String DEPENDENCY_TREE_FILE = ".smart-doc-dependency.json";

    @Test
    public void testFirstIncrementBuildWritesDependencyTree() throws IOException {
        Path dependencyTreeFile = Paths.get(System.getProperty("user.dir"), DEPENDENCY_TREE_FILE);
        byte[] backup = Files.exists(dependencyTreeFile) ? Files.readAllBytes(dependencyTreeFile) : null;
        Files.deleteIfExists(dependencyTreeFile);
        try {
            ApiConfig config = ApiConfigUtils.getProjectApiConfig();
            config.setIncrement(true);

            OpenApiBuilder.buildOpenApi(config);
            // The next build loads the persisted tree and must not fail either.
            OpenApiBuilder.buildOpenApi(config);

            assertTrue(Files.exists(dependencyTreeFile), "dependency tree file was not written");
            String content = new String(Files.readAllBytes(dependencyTreeFile), StandardCharsets.UTF_8);
            JsonObject json = JsonParser.parseString(content).getAsJsonObject();
            assertNotNull(json.get("commitId"), "commitId is missing");
            assertFalse(json.get("commitId").getAsString().isEmpty(), "commitId must not be empty");
            assertTrue(json.getAsJsonArray("dependencyTree").size() > 0, "dependency tree must not be empty");
        } finally {
            if (backup == null) {
                Files.deleteIfExists(dependencyTreeFile);
            } else {
                Files.write(dependencyTreeFile, backup);
            }
        }
    }

}
