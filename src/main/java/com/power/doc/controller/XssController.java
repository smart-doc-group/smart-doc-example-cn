package com.power.doc.controller;

import com.alibaba.fastjson2.JSON;
import com.power.common.model.CommonResult;
import com.power.doc.model.Children;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * xss拦击测试
 * @author yu 2019/1/20.
 */
@RestController
@RequestMapping("/xss")
public class XssController {

    private static final Logger LOGGER = LoggerFactory.getLogger(XssController.class);

    /**
     * xss过滤普通post请求
     * @param text 请求文本
     * @return
     */
    @PostMapping("/text")
    public CommonResult<String> testTxt(String text){
        LOGGER.info("params:{}",text);
        return CommonResult.ok().setResult(text);
    }

    /**
     * xss过滤get请求
     * @param query 请求参数
     * @return
     */
    @GetMapping("query")
    public CommonResult<String> query(String query){
        LOGGER.info("query: {}",query);
        return CommonResult.ok().setResult(query);
    }

    /**
     * xss过滤json数据
     * @param children
     * @return
     */
    @PostMapping("json")
    public CommonResult<Children> json(@RequestBody Children children){
        LOGGER.info("json: {}", JSON.toJSONString(children));
        return CommonResult.ok().setResult(children);
    }


}
