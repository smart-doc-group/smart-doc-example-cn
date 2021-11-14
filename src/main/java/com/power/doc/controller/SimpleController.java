package com.power.doc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author yu 2021/11/14.
 */
public interface SimpleController<R> {

    /**
     * 新增一个对象
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    default void create(@RequestBody @Validated R request) {
        System.out.println("新增的方法");
    }

    /**
     * 更新一个对象
     * @param id 编号
     */
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    default void update(@PathVariable Long id, @RequestBody @Validated R request) {
        System.out.println("更新的方法");
    }

    int test();
}
