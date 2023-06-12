package com.power.doc.controller;

import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 基础错误
 */
@Controller
@RequestMapping("${server.error.path:${error.path:/error}}")
public class BasicErrorController extends AbstractErrorController {


    /**
     * 测试基础错误路径
     */
    @GetMapping("err/test")
    public void test(){

    }


    public BasicErrorController(ErrorAttributes errorAttributes) {
        super(errorAttributes);
    }
}
