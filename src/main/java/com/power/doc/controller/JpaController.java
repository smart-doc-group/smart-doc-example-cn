package com.power.doc.controller;

import com.power.common.model.CommonResult;
import com.power.doc.entity.RoleDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Jpa代码测试
 * @author yu 2020/5/15.
 */
@RestController(value = "jpa")
public class JpaController {

    /**
     * Jpa Page
     * @author cht
     * @apiNote
     * 用于测试Jpa的分页查询
     * @return
     */
    @Deprecated
    @PostMapping(value = "/test")
    public Page<RoleDTO> test(){
        return null;
    }

    /**
     * Jpa Pageable查询参数重渲染
     * @apiNote 测试让smart-doc使用自定义对象来渲染生成文档
     * @param pageable com.power.doc.model.PageRequestDto
     */
    @PostMapping(value = "/pageableParam")
    public CommonResult testRender(@RequestBody Pageable pageable) {
        return CommonResult.ok();
    }
}
