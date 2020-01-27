package com.power.doc.controller;

import com.alibaba.fastjson.JSON;
import com.power.common.model.CommonResult;
import com.power.doc.entity.valid.Collect;
import com.power.doc.entity.valid.SaveAction;
import com.power.doc.entity.valid.UpdateAction;
import com.power.doc.model.BaseReq;
import com.power.doc.model.Leader;
import com.power.doc.model.SubUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 *
 * JSR303参数验证规范测试
 *
 * @author yu 2018/06/28.
 */

@RestController
@RequestMapping("validator")
public class ValidatorTestController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ValidatorTestController.class);

    /**
     * 验证validate
     *
     * @param leader
     * @return
     */
    @PostMapping("/test")
    public CommonResult testSimpleValidate(@Valid @RequestBody Leader leader) {
        LOGGER.debug("ReqParams:{}", JSON.toJSONString(leader));
        return CommonResult.ok();
    }


    /**
     * 验证通用参数
     * @param param
     * @return
     */
    @PostMapping("valid")
    public CommonResult testValid(@Valid @RequestBody BaseReq<SubUser> param){
        LOGGER.debug("ReqParams:{}", JSON.toJSONString(param));
        return CommonResult.ok();
    }

    /**
     * 分组验证1
     * @param collect
     * @return
     */
    @PostMapping("/save")
    public CommonResult save(@Validated({SaveAction.class}) @RequestBody Collect collect){
        return CommonResult.ok();
    }

    /**
     * 分组验证2
     * @param collect
     * @return
     */
    @PostMapping("/update")
    public CommonResult update(@Validated({UpdateAction.class}) @RequestBody Collect collect){
        return CommonResult.ok();
    }

}
