package com.power.doc.controller.parent;

import com.power.common.model.CommonResult;
import com.power.doc.entity.SimpleUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 继承接口测试
 * @author xingzi
 * @date 2021/6/27 13:35
 **/
@Controller
@RequestMapping("/parentExtends")
public class TestController {

    /**
     * 继承接口测试
     * @param user 用户基本信息
     * @return
     */
    @GetMapping("/update")
    public CommonResult<SimpleUser> updateUser(@RequestBody SimpleUser user){
        return CommonResult.ok();
    }
}
