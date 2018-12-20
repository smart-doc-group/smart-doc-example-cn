package com.power.doc.controller;

import com.power.common.model.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author yu 2018/12/20.
 */
@RestController
public class HttpsController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("testHttps")
    public CommonResult<String> testHttps(){
        String url = "https://www.baidu.com/";
        String result = restTemplate.getForObject(url, String.class);
        return CommonResult.ok().setResult(result);
    }

    @GetMapping("testHttp")
    public CommonResult<String> testHttp(){
        String url = "http://localhost:8080/simple/str";
        String result = restTemplate.getForObject(url, String.class);
        return CommonResult.ok().setResult(result);
    }


}
