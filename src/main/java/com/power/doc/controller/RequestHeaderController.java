package com.power.doc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * RequestHeader注解测试
 * @author xingzi
 * @date 2019 10 11  22:35
 */
@Slf4j
@RestController
public class RequestHeaderController {

    /**
     * 测试RequestHeader常规使用
     * @param name 请求头(name)
     * @param age   年龄
     */
    @GetMapping("testRequestHeader")
    public void testRequestHeader(@RequestHeader String name, Integer age) {

    }

    /**
     * 测试RequestHeader绑定参数名
     * @param name 请求头(name)
     * @param age   年龄
     */
    @GetMapping("testRequestHeader/value")
    public void testRequestHeaderAnnotationWithValue(@RequestHeader(value = "token", required = false)String name,@RequestHeader Integer age) {

    }

    /**
     * 测试RequestHeader绑定默认值
     * @param name 请求头(name)
     * @param age   年龄
     */
    @GetMapping("testRequestHeader/DefaultVal")
    public void testRequestHeaderAnnotationWithDefaultVal(@RequestHeader(value = "token",defaultValue = "da",required = false)String name, Integer age) {

    }

    /**
     * 测试Mapping中的headers属性
     * @return
     */
    @GetMapping(value = "testRequestHeader/foos", headers = { "key1=val1", "key2=val2" })
    @ResponseBody
    public String getFoosWithHeaders() {
        return "Get some Foos with Header";
    }


}
