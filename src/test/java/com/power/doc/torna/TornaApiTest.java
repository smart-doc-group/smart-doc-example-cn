package com.power.doc.torna;

import com.ly.doc.builder.TornaBuilder;
import com.ly.doc.builder.rpc.RpcTornaBuilder;
import com.ly.doc.model.ApiConfig;
import com.ly.doc.model.torna.TornaApi;
import com.power.doc.utils.ApiConfigUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.io.IOException;

/**
 * TornaApi Test
 *
 * @author linwumingshi
 */
@DisplayName("TornaApiTest")
public class TornaApiTest {

    private ApiConfig apiConfig;


    @BeforeEach
    public void initEach() throws IOException {
        apiConfig = ApiConfigUtils.getProjectApiConfig();
        Assert.notNull(apiConfig, "ApiConfig is null");
    }

    /**
     * Rest Api convert to TornaApi
     */
    @DisplayName("Rest Api convert to TornaApi")
    @Test
    public void testPushRestApi() {
        TornaApi tornaApi = TornaBuilder.getTornaApi(apiConfig);
        Assert.notNull(tornaApi, "TornaApi is null");
        Assert.notEmpty(tornaApi.getApis(), "TornaApi Apis is empty");
    }


    /**
     * Dubbo Api convert to TornaApi
     */
    @DisplayName("Dubbo Api convert to TornaApi")
    @Test
    public void testPushRPCApi() {
        TornaApi tornaApi = RpcTornaBuilder.getTornaApi(apiConfig);
        Assert.notNull(tornaApi, "TornaApi is null");
        Assert.notEmpty(tornaApi.getApis(), "TornaApi Apis is empty");
    }
}
