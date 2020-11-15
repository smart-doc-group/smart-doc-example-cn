package com.power.doc.controller.app;

import com.alibaba.fastjson.JSON;
import com.power.common.model.CommonResult;
import com.power.doc.model.FastJson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * app端接口测试
 * @author yu 2018/9/4.
 */
@Slf4j
@RestController
@RequestMapping("app")
public class AppController {

    /**
     * app测试
     * @param name 姓名
     * @param beginTime 开始时间
     * @param endTime 结束时间
     * @return
     */
    @PostMapping(value = "/test")
    public CommonResult test(@RequestBody CommonResult result){
        System.out.println(JSON.toJSONString(result));
        return CommonResult.ok().setResult(new FastJson().setUsername("yusun").setIdCard("530"));
    }

    /**
     * app测试2
     * @ignore
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
