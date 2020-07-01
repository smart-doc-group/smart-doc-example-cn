package com.power.doc.controller;

import com.power.doc.entity.Pager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 自定义ignore tag测试
 * @author yu 2020/7/1.
 */
@RestController
public class IgnoreTagController {

    /**
     * 测试get ignore
     * @param pager
     * @return
     */
    @GetMapping(value = "/ignore")
    public String test(Pager pager){
        return "hello apiNote";
    }
}
