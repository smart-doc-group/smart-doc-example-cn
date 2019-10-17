package com.power.doc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * apiNote注解测试
 * @author cht 2019/10/16.
 */
@RestController
public class ApiNoteController {

    /**
     * 测试apiNote
     * @apiNote 用于测试apiNote注释是否有效
     * @return
     */
    @GetMapping(value = "/test")
    public String test(){
        return "hello apiNote";
    }
}
