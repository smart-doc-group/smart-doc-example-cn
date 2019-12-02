package com.power.doc.controller;

import com.power.doc.model.User;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping(value = "/test")
    public String test(@RequestBody User user){
        return "hello apiNote";
    }
}
