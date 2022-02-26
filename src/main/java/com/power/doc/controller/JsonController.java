package com.power.doc.controller;

import com.power.doc.model.FastJson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * 测试json
 * @author yu 2020/11/17.
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
    public String getUserJson(@RequestParam String name, @RequestBody FastJson pramInfo) {
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
}
