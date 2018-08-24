package com.power.doc.controller;

import com.power.doc.model.Student;
import com.power.doc.model.Teacher;
import com.power.doc.model.User;
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
     * List<String>结构
     *
     * @return
     */
    @GetMapping(value = "listString")
    public List<String> testList() {
        return null;
    }


    /**
     * List<Map<String,String>>结构
     *
     * @return
     */
    @GetMapping(value = "/listMap")
    public List<Map<String, String>> testMap() {
        return null;
    }

    /**
     * List<自动义对象>
     *
     * @return
     */
    @PostMapping(value = "listObject")
    public List<User> testObject() {
        return null;
    }

    /**
     * List<Map<String,T>>结构
     *
     * @return
     */
    @GetMapping(value = "/listMap2")
    public List<Map<String, Student>> testMap1() {
        return null;
    }


    /**
     * List<Map<M,N<P,k>>>超复杂结构
     *
     * @return
     */
    @GetMapping(value = "/listMap3")
    public List<Map<String, Teacher<User, User, User>>> testMap2() {
        return null;
    }

    /**
     * List<T<List<M>,List<M>,List<M>>>超复杂结构
     *
     * @return
     */
    @GetMapping(value = "/listTeacher")
    public List<Teacher<List<User>, List<User>, List<User>>> testListTeacher() {
        return null;
    }

    /**
     * List<Teacher<Teacher<User,User,User>,User,User>>结构
     *
     * @return
     */
    @GetMapping(value = "listString1")
    public List<Teacher<Teacher<User, User, User>, User, User>> testListString() {
        return null;
    }


    /**
     * List<Teacher<Teacher<User,User,User>,Teacher<User,User,User>,Teacher<User,User,User>>>
     *
     * @return
     */
    @GetMapping(value = "listString2")
    public List<Teacher<Teacher<User, User, User>, Teacher<User, User, User>, Teacher<User, User, User>>> testList2() {
        return null;
    }
}
