package com.power.doc.controller.app;

import com.power.common.model.CommonResult;
import com.power.doc.constants.ApiVersion;
import com.power.doc.constants.RequestParamConstant;
import com.power.doc.constants.RequestValueConstant;
import com.power.doc.entity.Order;
import com.power.doc.model.FastJson;
import com.power.doc.model.mybatisplus.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * app端接口测试
 * @author yu 2018/9/4.
 */
@Slf4j
@RestController
@RequestMapping("app")
public class AppController {

    /**
     * Test Constants
     *
     * @param page 页码
     */
    @GetMapping(ApiVersion.ADMIN_ROOT+"/testConstants/" + ApiVersion.VERSION)
    public void testConstantsRequestParams(@RequestParam(required = false, defaultValue = RequestValueConstant.PAGE_DEFAULT_NONE, value = RequestParamConstant.PAGE) int page) {

    }
    /**
     * 分页查询订单信息
     * @param pageIndex 当前页码
     * @param pageSize 页面大小
     * @return
     */
    @GetMapping(value = "page/{pageIndex}/{pageSize}")
    public PageInfo<Order> queryPage(@PathVariable int pageIndex , @PathVariable int pageSize) {
        return null;
    }

    /**
     * app测试
     * @param name 姓名|zhangsan
     * @param beginTime 开始时间
     * @param endTime 结束时间
     * @return
     */
    @PostMapping(value = "/test")
    public CommonResult test(String name,String beginTime, String endTime){
        return CommonResult.ok().setResult(new FastJson().setUsername("yusun").setIdCard("530"));
    }

    /**
     * app测试2
     *
     * @param name 姓名
     * @param beginTime 开始时间
     * @param endTime 结束时间
     * @return
     */
    @GetMapping(value = "/test2")
    public String test2(String name,String beginTime, String endTime){
        return "hello app";
    }

    /**
     * app测试3
     * @param name 姓名
     * @param beginTime 开始时间
     * @param endTime 结束时间
     * @return
     */
    @GetMapping(value = "/test3")
    public String test3(String name,String beginTime, String endTime){
        return "hello app";
    }
}
