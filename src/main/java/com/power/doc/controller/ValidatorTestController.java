package com.power.doc.controller;

import com.alibaba.fastjson.JSON;
import com.power.common.model.CommonResult;
import com.power.doc.model.Leader;
import com.power.doc.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Description:
 * 关于Validator使用测试
 *
 * @author yu 2018/06/28.
 */

@RestController
@RequestMapping("validator")
public class ValidatorTestController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ValidatorTestController.class);

    /**
     * validate验证测试
     *
     * @param leader
     * @return
     */
    @PostMapping("/test")
    public CommonResult testSimpleValidate(@Valid @RequestBody Leader leader) {
        LOGGER.debug("ReqParams:{}", JSON.toJSONString(leader));
        return ResultUtil.returnSuccess("");
    }
}
