package com.power.doc.controller;

import com.power.common.model.CommonResult;
import com.power.doc.model.Student;
import com.power.doc.model.Teacher;
import com.power.doc.model.User;
import com.power.doc.model.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 *
 * List返回接口Api文档测试
 *
 * @author yu 2018/06/27.
 */
@RestController
@RequestMapping("list/")
public class ListController {

    /**
     * List&lt;String&gt;结构
     *
     * @return
     */
    @GetMapping(value = "listString")
    public List<String> testList() {
        return null;
    }


    /**
     * List&lt;Map&lt;String,String&gt;&gt;结构
     *
     * @return
     */
    @GetMapping(value = "/listMap")
    public List<Map<String, String>> testMap() {
        return null;
    }

    /**
     * List&lt;自动义对象&gt;
     *
     * @return
     */
    @PostMapping(value = "listObject")
    public List<User> testObject() {
        return null;
    }

    /**
     * List&lt;Map&lt;String,T&gt;&gt;结构
     *
     * @return
     */
    @GetMapping(value = "/listMap2")
    public List<Map<String, Student>> testMap1() {
        return null;
    }


    /**
     * List<Map<M,N<P,K,Y>>>超复杂结构
     *
     * @return
     */
    @GetMapping(value = "/listMap3")
    public List<Map<String, Teacher<User, User, User>>> testMap2() {
        return null;
    }

    /**
     * List&lt;T&lt;List&lt;M&gt;,List&lt;M&gt;,List&lt;M&gt;&gt;&gt;超复杂结构
     *
     * @return
     */
    @GetMapping(value = "/listTeacher")
    public List<Teacher<List<User>, List<User>, List<User>>> testListTeacher() {
        return null;
    }

    /**
     * List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,User,User&gt;&gt;结构
     *
     * @return
     */
    @GetMapping(value = "listString1")
    public List<Teacher<Teacher<User, User, User>, User, User>> testListString() {
        return null;
    }


    /**
     * List&lt;Teacher&lt;Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;,Teacher&lt;User,User,User&gt;&gt;&gt;
     *
     * @return
     */
    @GetMapping(value = "listString2")
    public List<Teacher<Teacher<User, User, User>, Teacher<User, User, User>, Teacher<User, User, User>>> testList2() {
        return null;
    }

    /**
     * CommonResult&lt;List&lt;UserDto&gt;&gt;
     * @return
     */
    @GetMapping(value = "listUserDto")
    public CommonResult<List<UserDto>> testListUserDto(){
        return null;
    }
}
