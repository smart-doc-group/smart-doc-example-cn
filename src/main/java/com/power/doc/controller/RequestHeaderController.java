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
     * 测试RequestHeader
     * @param name 请求头(name)
     * @param age   年龄
     */
    @GetMapping("testRequestHeader")
    public void testRequestHeader(@RequestHeader(value = "token",defaultValue = "da" ,required = false)String name, Integer age) {

    }
}
