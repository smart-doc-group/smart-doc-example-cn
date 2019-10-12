package com.power.doc.controller;

import org.springframework.web.bind.annotation.*;
/**
 * @author xingzi
 * @date 2019 10 11  22:35
 */
@RestController
public class RequestHeaderController {
    @GetMapping("testRequstHeader")
    public void testRequstHeader(@RequestHeader(value = "token",defaultValue = "da" ,required = false)String name, Integer age) {

    }
}
