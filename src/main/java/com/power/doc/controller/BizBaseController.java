package com.power.doc.controller;

import com.power.common.model.CommonResult;
import com.power.doc.service.BizBaseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class BizBaseController <Biz extends BizBaseService,Entity> {


    /**
     * 添加数据
     * @param entity
     * @return
     */
    @PostMapping("add")
    public CommonResult add(@RequestBody Entity entity){
        return CommonResult.ok();
    }

}
