package com.power.doc.controller;

import com.alibaba.fastjson2.JSON;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.power.common.model.CommonResult;
import com.power.doc.entity.Pager;
import com.power.doc.entity.Result;
import com.power.doc.entity.RoleDTO;
import com.power.doc.entity.User;
import com.power.doc.entity.UserRole;
import com.power.doc.entity.issue.plugin12.InteractiveProtocol;
import com.power.doc.model.UserDto;

import org.springframework.web.bind.annotation.*;

/**
 * 多泛型测试
 * @author xingzi  2020/07/08  10:22
 */
@RestController
@RequestMapping("/mulGenric")
public class MulGenericController {

    /**
     * test mulGeneric
     * @param user user对象
     * @response 测试返回数据
     * @return
     */
    @PostMapping("/test")
    public InteractiveProtocol<UserDto, UserRole> a(@RequestBody InteractiveProtocol<UserDto,UserRole> user){
        System.out.println(JSON.toJSONString(user));
        return null;
    }
    /**
     * 数组
     * @param data 3423
     * @mock 123
     * @return
     */
    @PostMapping("/test2/")
    public Result<RoleDTO, Pager> testPathVariable(@RequestBody Result<RoleDTO,Pager> data ){
        return null;
    }

    /**
     * gitee #I1S8W验证
     * @return
     */
    @GetMapping("/test3")
    public CommonResult<Result<Page<User>,User>> test(){
        return null;
    }
}
