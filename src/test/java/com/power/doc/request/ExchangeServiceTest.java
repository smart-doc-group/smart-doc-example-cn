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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Regression test for Spring {@code @HttpExchange} support.
 */
public class ExchangeServiceTest {

    @Test
    public void testHttpExchangeInterfaceIsDocumented() throws Exception {
        ApiConfig config = ApiConfigUtils.getProjectApiConfig();
        DocBuilderTemplate builderTemplate = new DocBuilderTemplate();
        builderTemplate.checkAndInit(config, Boolean.TRUE);
        config.setParamsDataToTree(false);
        ProjectDocConfigBuilder configBuilder = new ProjectDocConfigBuilder(config,
                JavaProjectBuilderHelper.create());
        IDocBuildTemplate<ApiDoc> docBuildTemplate = BuildTemplateFactory.getDocBuildTemplate(
                config.getFramework(), config.getClassLoader());
        List<ApiDoc> apiDocs = docBuildTemplate.getApiData(configBuilder).getApiDatas();

        ApiMethodDoc exchangeMethod = apiDocs.stream()
            .flatMap(doc -> doc.getList().stream())
            .filter(method -> method.getPath().endsWith("/exchange/name"))
            .findFirst()
            .orElse(null);

        assertNotNull(exchangeMethod, "@HttpExchange method is missing from the generated docs");
        assertEquals("GET", exchangeMethod.getType());
        assertNotNull(exchangeMethod.getQueryParams(), "query parameter is missing");
        assertEquals("id", exchangeMethod.getQueryParams().get(0).getField());
    }

}
