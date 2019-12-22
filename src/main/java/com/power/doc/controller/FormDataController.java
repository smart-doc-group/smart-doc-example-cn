package com.power.doc.controller;

import com.alibaba.fastjson.JSON;
import com.power.doc.entity.SimpleUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 接收表单参数
 * @author yu 2019/10/29.
 */
@Slf4j
@RestController
public class FormDataController {

    /**
     * 测试formData
     * @param simpleUser
     */
    @PostMapping("formData1")
    public void test(SimpleUser simpleUser){
       log.info(JSON.toJSONString(simpleUser));
    }

    /**
     * 测试formData带路径参数
     * @param simpleUser
     */
    @PostMapping("formData1/{id}")
    public void test(@PathVariable String id, SimpleUser simpleUser){
        log.info(JSON.toJSONString(simpleUser));
    }

    /**
     * 测试formData带路多个路径参数
     * @param simpleUser
     */
    @PostMapping("formData1/{id}/{age}")
    public void test(@PathVariable String id,@PathVariable Integer age, SimpleUser simpleUser){
        log.info(JSON.toJSONString(simpleUser));
    }


}
