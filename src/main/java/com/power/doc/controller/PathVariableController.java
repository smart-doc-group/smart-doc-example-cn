package com.power.doc.controller;

import com.power.common.model.CommonResult;
import com.power.doc.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * 数组类型pathVariable
 * @author xingzi
 * @date 2019 12 11  10:10
 */
@RestController
@RequestMapping("/pathVariable")
public class PathVariableController {

    /**
     * 接收数组类型pathVariable
     * @param id
     * @return
     */
    @GetMapping("/test/{id}")
    public CommonResult testPathVariable(@PathVariable("id")String [] id ){

        return CommonResult.ok().setResult(id);
    }

}
