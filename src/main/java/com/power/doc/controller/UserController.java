package com.power.doc.controller;

import com.power.doc.entity.SimpleUser;
import com.power.doc.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户信息操作接口
 * @author yu 2018/8/4.
 */

@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * 添加用户
     * @param user
     * @return
     */
    @PostMapping("/add")
    public User addUser(@RequestBody SimpleUser user){
        return null;
    }
}
