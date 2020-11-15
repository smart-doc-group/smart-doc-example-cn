package com.power.doc.controller.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * app端接口测试
 * @author yu 2018/9/4.
 */
@RestController
@RequestMapping("app")
public class AppController {

    /**
     * app测试
     * @param name 姓名
     * @param beginTime 开始时间
     * @param endTime 结束时间
     * @return
     */
    @GetMapping(value = "/test")
    public String test(String name,String beginTime, String endTime){
        return "hello app";
    }

    /**
     * app测试2
     * @ignore
     * @param name 姓名
     * @param beginTime 开始时间
     * @param endTime 结束时间
     * @return
     */
    @GetMapping(value = "/test")
    public String test2(String name,String beginTime, String endTime){
        return "hello app";
    }

    /**
     * app测试3
     * @param name 姓名
     * @param beginTime 开始时间
     * @param endTime 结束时间
     * @return
     */
    @GetMapping(value = "/test")
    public String test3(String name,String beginTime, String endTime){
        return "hello app";
    }
}
