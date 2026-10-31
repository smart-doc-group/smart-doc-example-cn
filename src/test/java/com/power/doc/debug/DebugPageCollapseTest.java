package com.power.doc.debug;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Regression test for the debug page: the request/response parameter tables must
 * be collapsible.
 */
public class DebugPageCollapseTest {

    private static final Pattern BODY_PARAMETERS = Pattern
        .compile("<details[^>]*>\\s*<summary>\\s*<strong>Body-parameters:");

    private static final Pattern RESPONSE_FIELDS = Pattern
        .compile("<details[^>]*>\\s*<summary>\\s*<strong>Response-fields:");

    private static final String[] TEMPLATES = { "template/debug-all.html", "template/html/debug.html" };

    @Test
    public void testParameterTablesAreCollapsible() throws IOException {
        for (String templateName : TEMPLATES) {
            String template = readTemplate(templateName);
            assertTrue(BODY_PARAMETERS.matcher(template).find(),
                    templateName + ": Body-parameters is not collapsible");
            assertTrue(RESPONSE_FIELDS.matcher(template).find(),
                    templateName + ": Response-fields is not collapsible");
        }
    }

    private String readTemplate(String name) throws IOException {
        try (InputStream input = getClass().getClassLoader().getResourceAsStream(name)) {
            assertNotNull(input, name + " is missing");
            return new String(input.readAllBytes(), StandardCharsets.UTF_8);
        }
    }

}
