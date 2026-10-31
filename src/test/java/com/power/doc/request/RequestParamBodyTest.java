package com.power.doc.request;

import com.power.doc.utils.ApiConfigUtils;
import io.github.smartdoc.builder.DocBuilderTemplate;
import io.github.smartdoc.builder.ProjectDocConfigBuilder;
import io.github.smartdoc.factory.BuildTemplateFactory;
import io.github.smartdoc.helper.JavaProjectBuilderHelper;
import io.github.smartdoc.model.ApiConfig;
import io.github.smartdoc.model.ApiDoc;
import io.github.smartdoc.model.ApiMethodDoc;
import io.github.smartdoc.template.IDocBuildTemplate;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Regression test for a GET endpoint that only declares a single
 * {@code @RequestParam}: the query parameter must not be rendered as a request
 * body, otherwise the debug page appends it to the URL again.
 */
public class RequestParamBodyTest {

    @Test
    public void testQueryParamIsNotRenderedAsRequestBody() throws Exception {
        ApiConfig config = ApiConfigUtils.getProjectApiConfig();
        DocBuilderTemplate builderTemplate = new DocBuilderTemplate();
        builderTemplate.checkAndInit(config, Boolean.TRUE);
        config.setParamsDataToTree(false);
        ProjectDocConfigBuilder configBuilder = new ProjectDocConfigBuilder(config,
                JavaProjectBuilderHelper.create());
        IDocBuildTemplate<ApiDoc> docBuildTemplate = BuildTemplateFactory.getDocBuildTemplate(
                config.getFramework(), config.getClassLoader());
        List<ApiDoc> apiDocs = docBuildTemplate.getApiData(configBuilder).getApiDatas();

        ApiMethodDoc getMapping = apiDocs.stream()
            .flatMap(doc -> doc.getList().stream())
            .filter(method -> method.getPath().endsWith("getMapping"))
            .findFirst()
            .orElse(null);

        assertNotNull(getMapping, "GET /getMapping is missing from the generated docs");
        String jsonBody = getMapping.getRequestExample().getJsonBody();
        assertTrue(jsonBody == null || jsonBody.isEmpty(),
                "query parameter must not be documented as a request body, but was: " + jsonBody);
    }

}
