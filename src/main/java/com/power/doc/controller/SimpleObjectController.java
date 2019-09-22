package com.power.doc.controller;

import com.power.common.model.CommonResult;
import com.power.doc.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * 普通java对象api文档测试
 *
 * @author yu 2018/06/27.
 */
@RestController
@RequestMapping("simple/")
public class SimpleObjectController {

    /**
     * 返回普通String测试
     *
     * @return
     */
    @GetMapping("/str")
    public String testString() {

        return "hello world";
    }

    /**
     * 返回普通javabean
     *
     * @param user
     * @return
     */
    @PostMapping("/user")
    public User testUser(@RequestBody User user) {
        return null;
    }

    /**
     * 返回复杂实体数据
     *
     * @return
     */
    @PostMapping("/stu")
    public Student testStu() {
        return null;
    }

    /**
     * Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;结构
     *
     * @return
     */
    @PostMapping("/teacher")
    public Teacher<Teacher<User, User, User>, Teacher<User, User, User>, Teacher<User, User, User>> testTeacher() {
        return null;
    }

    /**
     * Teacher&lt;List&lt;User&gt;, User, Student&gt;
     *
     * @return
     */
    @PostMapping("/teacher2")
    public Teacher<List<User>, User, Student> testTeacher1() {
        return null;
    }

    /**
     * 测试SubUser
     * @return
     */
    @PostMapping("/subUser")
    public SubUser testSubUser(){
        return null;
    }

    /**
     * 返回CommonResult&lt;SubUser&gt;
     * @return
     */
    @PostMapping("/subUser/result")
    public CommonResult<SubUser> testSubUserResult() {
        return null;
    }


}
