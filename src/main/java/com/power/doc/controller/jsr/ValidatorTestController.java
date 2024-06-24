package com.power.doc.controller.jsr;

import com.alibaba.fastjson2.JSON;
import com.power.common.model.CommonResult;
import com.power.doc.controller.BaseController;
import com.power.doc.entity.valid.*;
import com.power.doc.model.BaseReq;
import com.power.doc.model.Leader;
import com.power.doc.model.SubUser;
import jakarta.validation.groups.Default;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

/**
 * JSR303参数验证规范测试
 *
 * @author yu 2018/06/28.
 */
@RestController
@RequestMapping("validator")
public class ValidatorTestController extends BaseController<Leader> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ValidatorTestController.class);

    /**
     * default 不显性引入Default分组。结果必须显示Required true
     *
     * @param leader leader
     * @return CommonResult
     */
    @PostMapping("/noDefaultGroup")
    public CommonResult<?> noDefaultGroup(@Validated @RequestBody Leader leader) {
        return CommonResult.ok();
    }

    /**
     * default 显性引入Default分组。结果必须显示Required true
     *
     * @param leader leader
     * @return CommonResult
     */
    @PostMapping("/hasDefaultGroup")
    public CommonResult<?> hasDefaultGroup(@Validated(Default.class) @RequestBody Leader leader) {
        return CommonResult.ok();
    }

    /**
     * 验证 没有校验注解。结果必须全部为Required false
     *
     * @param leader leader
     * @return CommonResult
     */
    @PostMapping("/noValidateAnnotation")
    public CommonResult<?> noValidateAnnotation(@RequestBody Leader leader) {
        return CommonResult.ok();
    }


    /**
     * 验证 @Valid
     *
     * @param leader leader
     * @return CommonResult
     */
    @PostMapping("/test")
    public CommonResult testSimpleValidate(@Valid @RequestBody Leader leader) {
        LOGGER.debug("ReqParams:{}", JSON.toJSONString(leader));
        return CommonResult.ok();
    }

    /**
     * 验证通用参数
     *
     * @param param param
     * @return CommonResult
     */
    @PostMapping("valid")
    public CommonResult testValid(@Valid @RequestBody BaseReq<SubUser> param) {
        LOGGER.debug("ReqParams:{}", JSON.toJSONString(param));
        return CommonResult.ok();
    }

    /**
     * 分组验证1
     *
     * @param collect collect
     * @return CommonResult
     */
    @PostMapping("/save")
    public CommonResult save(@Validated({SaveAction.class}) @RequestBody Collect collect) {
        return CommonResult.ok();
    }

    /**
     * 分组验证2
     *
     * @param collect collect
     * @return CommonResult
     */
    @PostMapping("/update")
    public CommonResult update(@Validated({UpdateAction.class}) @RequestBody Collect collect) {
        return CommonResult.ok();
    }

    /**
     * 分组验证3
     *
     * @param collect collect
     * @return CommonResult
     */
    @PostMapping("/login")
    public CommonResult login(@Validated({Collect.SendCode.class}) @RequestBody Collect collect) {
        return CommonResult.ok();
    }


    /**
     * 分组验证4
     *
     * @param collect collect
     * @return CommonResult
     */
    @PostMapping("/test4")
    public String test4(@Validated({Collect.SendCode.class}) @RequestBody Collect collect) {
        return null;
    }


    /**
     * 测试父级内部注解分组校验
     *
     * @param collect collect
     * @return CommonResult
     */
    @PostMapping("/testInnerValid")
    public CommonResult<Void> testInnerValid(@RequestBody @Validated(Collect.add.class) Collect collect) {
        return CommonResult.ok();
    }


    /**
     * 测试继承默认分组
     *
     * @param collect collect
     * @return CommonResult
     */
    @PostMapping("/testExtendsDefault")
    public CommonResult<Void> testExtendsDefault(@RequestBody @Validated(TwoSaveAction.class) Collect collect) {
        return CommonResult.ok();
    }

    /**
     * 测试内部接口继承默认分组
     *
     * @param collect collect
     * @return CommonResult
     */
    @PostMapping("/testExtendsDefault2")
    public CommonResult<Void> testExtendsDefault2(@RequestBody @Validated(Collect.SignUp.class) Collect collect) {
        return CommonResult.ok();
    }

    /**
     * 测试新增
     *
     * @param collect collect
     * @return CommonResult
     */
    @PostMapping("/testSave")
    public CommonResult<Void> testSave(@RequestBody @Validated({SaveAction.class}) Collect collect) {
        return CommonResult.ok();
    }

    /**
     * 测试更新
     *
     * @param collect collect
     * @return CommonResult
     */
    @PostMapping("/testUpdate")
    public CommonResult<Void> testUpdate(@RequestBody @Validated({UpdateAction.class}) Collect collect) {
        return CommonResult.ok();
    }


    /**
     * 测试多个普通分组(不包含Default Group)更新
     *
     * @param collect collect
     * @return CommonResult
     */
    @PostMapping("/testUpdateByTwoGroup")
    public CommonResult<Void> testUpdateByTwoGroup(@RequestBody @Validated({BaseValid.edit.class, Collect.add.class}) Collect collect) {
        return CommonResult.ok();
    }


    /**
     * 测试多个分组(包含Default Group)更新
     *
     * @param collect collect
     * @return CommonResult
     */
    @PostMapping("/testUpdateByMultipleGroup")
    public CommonResult<Void> testUpdateByMultipleGroup(@RequestBody @Validated({BaseValid.edit.class, Collect.add.class, Default.class}) Collect collect) {
        return CommonResult.ok();
    }


}
