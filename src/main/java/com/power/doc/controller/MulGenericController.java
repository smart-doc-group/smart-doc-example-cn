package com.power.doc.controller;

import com.power.doc.entity.Pager;
import com.power.doc.entity.Result;
import com.power.doc.entity.RoleDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 多泛型测试
 * @author xingzi  2020/07/08  10:22
 */
@RestController
@RequestMapping("/mulGenric")
public class MulGenericController {
    /**
     * 数组
     * @param data 3423
     * @mock 123
     * @return
     */
    @PostMapping("/test/")
    public Result<RoleDTO, Pager> testPathVariable(@RequestBody Result<RoleDTO,Pager> data ){
        return null;
    }
}
