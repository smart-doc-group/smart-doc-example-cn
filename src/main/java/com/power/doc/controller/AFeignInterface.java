package com.power.doc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * feign测试
 * @restApi
 * @author yu 2020/6/21.
 */
@RequestMapping("feign")
public interface AFeignInterface {

    @GetMapping(value = "/enum")
    String test();
}
