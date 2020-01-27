package com.power.doc.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * apiNote注解测试
 * @author cht 2019/10/16.
 */
@RestController
public class ApiNoteController {

    /**
     * 测试apiNote
     * @author cht
     * @apiNote 用于测试apiNote注释是否有效
     * @return
     */
    @Deprecated
    @PostMapping(value = "/test")
    public String test(List<String> user){
        return "hello apiNote";
    }
}
