package com.power.doc.controller;

import com.power.doc.entity.User;
import org.springframework.web.bind.annotation.*;

/**
 * 请求类型测试
 *
 * @author songhaozhi
 * @author test
 * @date 2020/1/16
 */
@RestController
public class RequestTypeController {
    /**
     * 测试GetMapping 无参数
     *
     * @author zhangsan
     * @author wangwu
     */
    @GetMapping("getMapping1")
    public void testGetMapping1() {

    }

    /**
     * 测试PostMapping 无参数
     *
     * @author songhaozhi
     */
    @PostMapping("PostMapping1")
    public void PostMapping1() {

    }

    /**
     * 测试PutMapping 无参数
     */
    @PutMapping("PutMapping1")
    public void PutMapping1() {

    }

    /**
     * DeleteMapping 无参数
     */
    @DeleteMapping("DeleteMapping1")
    public void DeleteMapping1() {

    }

    /**
     * 测试GetMapping
     *
     * @param userId userId
     */
    @GetMapping("getMapping")
    public void testGetMapping(@RequestParam Long userId) {

    }

    /**
     * 测试PostMapping json
     *
     * @param user user
     */
    @PostMapping("postMapping")
    public void testPostMapping(@RequestBody User user) {

    }

    /**
     * 测试PostMapping表单
     *
     * @param user user
     */
    @PostMapping("postMapping2")
    public void postMapping2(User user) {

    }

    /**
     * 测试PutMapping json
     *
     * @param user user
     */
    @PutMapping("putMapping")
    public void testPutMapping(@RequestBody User user) {

    }

    /**
     * 测试PutMapping表单
     *
     * @param user user
     */
    @PutMapping("putMapping2")
    public void putMapping2(User user) {

    }

    /**
     * 测试DeleteMapping
     *
     * @param userId userId
     */
    @DeleteMapping("deleteMapping")
    public void testDeleteMapping(@RequestParam Long userId) {

    }
}
