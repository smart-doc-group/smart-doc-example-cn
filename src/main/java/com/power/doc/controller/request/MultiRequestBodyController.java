package com.power.doc.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.power.common.model.CommonResult;
import com.power.doc.entity.User;
import com.power.doc.model.*;
import com.power.doc.model.userinfo.UserInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 一个接口使用多个RequestBody注解生成文档案例
 * （真实项目中要使用多个RequestBody注解，需要自己实现HttpServletRequestWrapper 做处理，具体操作请百度）
 * @date 2023年4月10日19:24:17
 * @author ziro
 */
@RestController
public class MultiRequestBodyController {


    /**
     * 测试多个 RequestBody 注解生成文档
     * @param teacher 用户信息
     * @param page 分页信息
     * @return 用户列表
     */
    @PostMapping("/queryUserList")
    public CommonResult<List<User>> queryUserList(@RequestBody Teacher<UserInfo<String,String>, Role, Subject> teacher, @RequestBody Page<User> page){
        CommonResult<List<User>> commonResult = new CommonResult<>();
        commonResult.setResult(new ArrayList<>());
        return commonResult;
    }

    /**
     * 根据条件获取用户
     * @param userInfo 用户信息
     * @param leader 领导
     * @return CommonResult<User>
     */
    @PostMapping("/queryUser")
    public CommonResult<User> queryUser(@RequestBody  UserInfo<String,List<String>> userInfo, @RequestBody Staff<Leader> leader){
        CommonResult<User> commonResult = new CommonResult<>();
        commonResult.setResult(new User());
        return commonResult;
    }

}
