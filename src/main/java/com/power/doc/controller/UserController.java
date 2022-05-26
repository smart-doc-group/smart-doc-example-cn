package com.power.doc.controller;

import com.power.doc.entity.*;
import com.power.doc.entity.page.Page;
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
    public ResultUtil<User> addUser(@RequestBody SimpleUser user){
        return null;
    }

    /**
     * 更新用户
     * @param user @mock  {"address":"成都市","sex":1,"age":16,"name":"smart-doc","extand""{"version":1.0,"versionList":["1.2.0","1.5.6"]}}
     * @return
     */
    @PutMapping("/update")
    public User updateUser(@RequestBody SimpleUser user){
        return null;
    }
}
