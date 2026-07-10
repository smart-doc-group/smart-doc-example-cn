package com.power.doc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * json文件配置全局参数测试
 * @tag 哇哇哇哇哇
 * @author chen qi 2021-07-16 14:09
 **/
@RestController
public class ConfigRequestParamController {

    /**
     * get请求测试query参数
     * @tag 顶顶顶到达
     * @author cqmike
     * @return
     */
    @GetMapping("configQueryParamGet")
    public void configQueryParamGet(String configQueryParam) {

    }

    /**
     * post请求测试query参数
     *
     * @tag 顶顶顶到达
     * @author cqmike
     * @return
     */
    @PostMapping("configQueryParamPost")
    public void configQueryParamPost(String configQueryParam) {

    }

    /**
     *  get请求测试query参数和path参数
     *
     * @tag 顶顶顶到达1
     * @author cqmike
     * @return
     */
    @GetMapping("configParamGet/{configPathParam}")
    public void configParamGet(@PathVariable("configPathParam") String configPathParam, String configQueryParam) {

    }

    /**
     *  post请求测试query参数和path参数
     *
     * @author cqmike
     * @return
     */
    @PostMapping("configParamPost/{configPathParam}")
    public void configParamPost(@PathVariable("configPathParam") String configPathParam, String configQueryParam) {

    }
}
