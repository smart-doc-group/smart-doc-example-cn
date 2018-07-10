package com.power.doc.controller;

import com.power.doc.model.FastJson;
import com.power.doc.model.JacksonAnnotation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Fastjson和Jackson注解支持测试
 * @author yu 2018/7/10.
 */
@RestController
@RequestMapping("json")
public class JsonTest {

    /**
     * Jackson注解支持测试
     * @param annotation
     * @return
     */
    @RequestMapping(value = "jacksonTest")
    public JacksonAnnotation testJackson(@RequestBody JacksonAnnotation annotation){
        return null;
    }

    /**
     * fastjson注解支持测试
     * @param fastJson
     * @return
     */
    @RequestMapping(value = "fastjsonTest")
    public FastJson testFastJson(@RequestBody FastJson fastJson){
        return null;
    }
}
