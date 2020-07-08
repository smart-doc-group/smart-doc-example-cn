package com.power.doc.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.power.common.model.CommonResult;
import com.power.doc.entity.RoleDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * mybatis-plus测试
 * @author yu 2020/6/30.
 */
@RestController
@RequestMapping("mybatis/plus")
public class MybatisPlusPageController {

    /**
     * mybatis-plus分页类测试
     * @return
     */
    @PostMapping("page")
    public CommonResult<Page<RoleDTO>> testPage() {
        return CommonResult.ok();
    }
}
