package com.power.doc.controller;

import com.power.common.model.CommonResult;
import com.power.doc.entity.KeyValuePair;
import com.power.doc.entity.PageHelperUtil;
import com.power.doc.entity.RoleDTO;
import com.power.doc.entity.SimpleUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * java泛型解析测试
 * @author yu 2020/7/2.
 */
@RestController
@RequestMapping("generics")
public class GenericsController {

    /**
     * 测试多泛型1
     * @return
     */
    @GetMapping("test1")
    public KeyValuePair<RoleDTO,SimpleUser> test(){
        return null;
    }

    /**
     * 测试多泛型2
     * @return
     */
    @GetMapping("test2")
    public PageHelperUtil<RoleDTO,SimpleUser> test2(){
        return null;
    }

    /**
     * 测试单泛型嵌套
     * @return
     */
    @GetMapping("test3")
    public CommonResult<RoleDTO> test3() {
        return null;
    }
}
