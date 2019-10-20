package com.power.doc.controller;

import org.springframework.web.bind.annotation.*;
/**
 * RequestHeader注解测试
 * @author xingzi
 * @date 2019 10 11  22:35
 */
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
    public void testRequestHeaderAnnotationWithValue(@RequestHeader(value = "token", required = false)String name, Integer age) {

    }

    /**
     * 测试RequestHeader绑定默认值
     * @param name 请求头(name)
     * @param age   年龄
     */
    @GetMapping("testRequestHeader/DefaultVal")
    public void testRequestHeaderAnnotationWithDefaultVal(@RequestHeader(value = "token",defaultValue = "da",required = false)String name, Integer age) {

    }


}
