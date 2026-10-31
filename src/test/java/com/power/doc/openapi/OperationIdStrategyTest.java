package com.power.doc.openapi;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.power.doc.utils.ApiConfigUtils;
import io.github.smartdoc.builder.openapi.OpenApiBuilder;
import io.github.smartdoc.builder.openapi.SwaggerBuilder;
import io.github.smartdoc.constants.OperationIdStrategyEnum;
import io.github.smartdoc.model.ApiConfig;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Regression test for the configurable operationId strategy.
 */
public class OperationIdStrategyTest {

    private static final String PATH = "/getMapping";

    private static final String METHOD = "get";

    @Test
    public void testOpenApiDefaultsToMethodName() throws IOException {
        String operationId = buildOpenApi(null);
        assertTrue(operationId.matches("testGetMapping(_\\d+)?"), operationId);
    }

    @Test
    public void testOpenApiMethodIdStrategy() throws IOException {
        String operationId = buildOpenApi(OperationIdStrategyEnum.METHOD_ID);
        assertTrue(operationId.matches("[0-9a-f]{32}"), operationId);
    }

    @Test
    public void testOpenApiPathMethodHttpStrategy() throws IOException {
        String operationId = buildOpenApi(OperationIdStrategyEnum.PATH_METHOD_HTTP);
        assertEquals("getMapping-testGetMapping-GET", operationId);
    }

    @Test
    public void testSwaggerKeepsLegacyOperationIdByDefault() throws IOException {
        String operationId = buildSwagger(null);
        assertTrue(operationId.matches("testGetMapping_[0-9a-f]{32}UsingOnGET"), operationId);
    }

    @Test
    public void testSwaggerConfiguredStrategy() throws IOException {
        String operationId = buildSwagger(OperationIdStrategyEnum.METHOD_NAME);
        assertTrue(operationId.matches("testGetMapping(_\\d+)?"), operationId);
    }

    private String buildOpenApi(OperationIdStrategyEnum strategy) throws IOException {
        ApiConfig config = newConfig(strategy);
        OpenApiBuilder.buildOpenApi(config);
        return readOperationId(config);
    }

    private String buildSwagger(OperationIdStrategyEnum strategy) throws IOException {
        ApiConfig config = newConfig(strategy);
        SwaggerBuilder.buildOpenApi(config);
        return readOperationId(config);
    }

    private ApiConfig newConfig(OperationIdStrategyEnum strategy) throws IOException {
        ApiConfig config = ApiConfigUtils.getProjectApiConfig();
        config.setIncrement(false);
        config.setOperationIdStrategy(strategy);
        return config;
    }

    private String readOperationId(ApiConfig config) throws IOException {
        Path openApiFile = Paths.get(config.getOutPath(), "openapi.json");
        String content = new String(Files.readAllBytes(openApiFile), StandardCharsets.UTF_8);
        JsonObject paths = JsonParser.parseString(content).getAsJsonObject().getAsJsonObject("paths");
        return paths.getAsJsonObject(PATH).getAsJsonObject(METHOD).get("operationId").getAsString();
    }

}
