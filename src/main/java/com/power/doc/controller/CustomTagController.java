package com.power.doc.controller;

import com.power.common.model.CommonResult;
import com.power.doc.entity.SimpleUser;
import com.power.doc.model.SubUser;
import com.power.doc.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 自定意义注释tag测试
 * @author yu 2019/12/21.
 */
@RestController("tag")
public class CustomTagController {

    /**
     *
     * 使用mock获取自定义值
     * @param user
     * @return
     */
    @PostMapping("mock")
    public CommonResult<SimpleUser> testMockTag(@RequestBody SubUser user) {
        return CommonResult.ok().setResult(user);
    }
}
