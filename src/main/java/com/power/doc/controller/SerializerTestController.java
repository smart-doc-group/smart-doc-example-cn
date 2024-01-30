package com.power.doc.controller;

import com.power.doc.model.SerializerTestModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试ToStringSerializer序列化
 * @author yusun 2024/01/30
 */
@RestController
@RequestMapping("/serializer")
public class SerializerTestController {


    /**
     * 测试方法
     * @param model
     */
    @GetMapping
    public void testSerializer(@RequestBody SerializerTestModel model) {

    }
}
