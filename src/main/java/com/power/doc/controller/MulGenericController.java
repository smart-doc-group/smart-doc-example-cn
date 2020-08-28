package com.power.doc.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.power.common.model.CommonResult;
import com.power.doc.entity.Pager;
import com.power.doc.entity.Result;
import com.power.doc.entity.RoleDTO;
import com.power.doc.entity.User;
import org.springframework.web.bind.annotation.*;

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

    /**
     * gitee #I1S8W验证
     * @return
     */
    @GetMapping("/test2")
    public CommonResult<Result<Page<User>,User>> test(){
        return null;
    }
}
