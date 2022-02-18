package com.power.doc.controller.app;

import com.power.common.model.CommonResult;
import com.power.doc.entity.OneLevelRequest;
import com.power.doc.entity.TwoLevelRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yu 2022/2/18.
 */
public class DemoController {

    /**
     * 一层继承
     *
     * @param request
     * @return
     */
    @RequestMapping("one-level")
    public CommonResult test(@RequestBody OneLevelRequest request) {
        return CommonResult.ok();
    }

    /**
     * 两层继承
     *
     * @param request
     * @return
     */
    @RequestMapping("two-level")
    public CommonResult test(@RequestBody TwoLevelRequest request) {
        return CommonResult.ok();
    }
}
