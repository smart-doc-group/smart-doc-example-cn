package com.power.doc.controller.page;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.power.common.model.CommonResult;
import com.power.doc.entity.RoleDTO;
import com.power.doc.model.mybatisplus.MybatisPlusPage;
import com.power.doc.model.mybatisplus.PageInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * mybatis-plus分页测试
 * @author yu 2020/6/30.
 */
@RestController
@RequestMapping("mybatis/plus")
public class MybatisPlusPageController {

    /**
     * mybatis-plus原始分页类测试
     * @return
     */
    @GetMapping("page")
    public CommonResult<Page<RoleDTO>> testPage() {
        return CommonResult.ok();
    }

    /**
     * mybatis-plus分页自定义处理测试
     * @return
     */
    @GetMapping("page2")
    public CommonResult<PageInfo<RoleDTO>> testPage2(){
        return CommonResult.ok();
    }

    /**
     * mybatis-plus分页自定义处理测试2
     * @return
     */
    @GetMapping("page3")
    public CommonResult<MybatisPlusPage<RoleDTO>> testPage3(){
        return CommonResult.ok();
    }
}
