package com.power.doc.controller;

import com.alibaba.fastjson.JSON;
import com.power.doc.entity.SimpleUser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 接收表单参数
 * @author yu 2019/10/29.
 */
@RestController
public class FormDataController {

    /**
     * 测试formData
     * @param simpleUser
     */
    @PostMapping("formData1")
    public void test(SimpleUser simpleUser){
        System.out.println(JSON.toJSONString(simpleUser));
    }
}
