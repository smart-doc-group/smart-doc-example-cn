package com.power.doc.controller;

import com.power.doc.model.MyUser;
import com.power.doc.model.circular.A;
import com.power.doc.model.circular.SelfRef;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 循环引用依赖测试
 * @since smart-doc 1.7.4
 * @author yu 2019/10/24.
 */
@RestController
public class CircularReferenceController {
    /**
     * 自循环依赖
     * @param user
     */
    @PostMapping("/circularReference2")
    public void  test2(@RequestBody SelfRef user) {
        return;
    }

    /**
     * 循环依赖参数推导
     * @apiNote 循环依赖参数推导(不建议使用)
     * @return
     */
    @PostMapping(value = "/circularReference")
    public A test(@RequestBody A user){
        return null;
    }


}
