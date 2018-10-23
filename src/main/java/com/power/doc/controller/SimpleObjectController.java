package com.power.doc.controller;

import com.power.doc.model.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @PostMapping("/str")
    public String testString() {

        return null;
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
     * 返回Student
     *
     * @return
     */
    @PostMapping("/stu")
    public Student testStu() {
        return null;
    }

    /**
     * Teacher<Teacher<User,User,User>,Teacher<User,User,User>,Teacher<User,User,User>>结构
     *
     * @return
     */
    @PostMapping("/teacher")
    public Teacher<Teacher<User, User, User>, Teacher<User, User, User>, Teacher<User, User, User>> testTeacher() {
        return null;
    }

    /**
     * Teacher<List<User>, User, Student>
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


}
