package com.power.doc.controller;

import com.power.common.model.CommonResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试类多路径
 * @author <a href="mailto:cqmike0315@gmail.com" rel="nofollow">chenqi</a>
 * @version 1.0
 */
@RestController
@RequestMapping(value = {"/testMultiPathOne/{path}/test", "/testMultiPathTwo/{path}/test"})
public class ClassMultiPathController {

    /**
     *  测试1
     *
     * @author chenqi
     * @param name 名称
     * @since 1.0.0
     * @return
     */
    @PostMapping("/abc")
    public CommonResult<Void> test1(@PathVariable("path") String path, String name) {
        return CommonResult.ok();
    }

    /**
     * 测试2
     *
     * @author cqmike
     * @param path 路径1
     * @param ppp  路径2
     * @since 1.0.0
     * @return
     */
    @PostMapping(value = {"/{path2}/abc2", "/{path2}/abc3"})
    public CommonResult<Void> test2(@PathVariable("path") String path, @PathVariable("path2") String ppp) {
        return CommonResult.ok();
    }
}
