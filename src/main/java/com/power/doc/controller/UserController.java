package com.power.doc.controller;

import com.power.doc.entity.SimpleUser;
import com.power.doc.entity.User;
import org.springframework.web.bind.annotation.*;

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

    /**
     * 更新用户
     * @param user
     * @return
     */
    @PutMapping("/update")
    public User updateUser(@RequestBody SimpleUser user){
        return null;
    }
}
