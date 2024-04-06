package com.power.doc.controller.json;

import com.power.doc.model.FastJson;
import com.power.doc.model.JacksonAnnotation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 *  FastJson和Jackson注解支持测试
 * @author yu 2018/7/10.
 */
@Slf4j
@RestController
public class JsonController {

    /**
     * RequestParam+json
     * @param name
     * @param pramInfo
     * @return
     */
    @PostMapping(value = "/getUserJson")
    public FastJson getUserJson(@RequestParam String name, @RequestBody FastJson pramInfo) {
        return null;
    }

    /**
     * 测试
     * @param id 编号
     * @param name 名称
     * @return
     */
    @PostMapping(value = "/getUserJson1/{id}")
    public String getUserJson(@PathVariable int id,@RequestParam String name){
        return "hello";
    }

    /**
     * 测试2
     * @param name 姓名
     * @param age 年龄
     * @return
     */
    @GetMapping(value = "/getUserJson1/")
    public String getUserJson2(String name,int age){
        log.info("name={},age={}",name,age);
        return "hello";
    }


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
     * FastJson注解支持测试
     * @param fastJson
     * @return
     */
    @RequestMapping(value = "fastJsonTest")
    public FastJson testFastJson(@RequestBody FastJson fastJson){
        return null;
    }
}
