package com.power.doc.controller;

import com.power.doc.constants.ApiVersion;
import com.power.doc.constants.Demo2Constant;
import com.power.doc.constants.RequestParamConstant;
import com.power.doc.constants.RequestValueConstant;
import com.power.doc.entity.GetMainGoodsByItemNosBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

/**
 * 常量测试
 */
public class ConstantsController {

    /**
     * 常量解析
     * @return
     */
    @GetMapping( Demo2Constant.DemoConstant+ Demo2Constant.Demo2Constant)
    public String demoRest4(){
        return "Success";
    }

    /**
     * Test Constants
     *
     * @param page 页码
     */
    @GetMapping(ApiVersion.ADMIN_ROOT+"/testConstants/" + ApiVersion.VERSION)
    public HashMap<String, GetMainGoodsByItemNosBody.GetMainGoodsByItemNosInfo> testConstantsRequestParams(@RequestParam(required = false, defaultValue = RequestValueConstant.PAGE_DEFAULT_NONE, value = RequestParamConstant.PAGE) int page) {
        return null;
    }
}
