package com.power.doc.controller;

import com.power.common.model.CommonResult;
import com.power.doc.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * Path参数测试
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

    /**
     * Path正则测试1
     * @param fileId 文件id
     * @return
     */
    @GetMapping("download/{fileId:^[A-Za-z0-9_-]{10,50}$}")
    public CommonResult testPathRegex1(@PathVariable String fileId){
        return CommonResult.ok();
    }

    /**
     * Path正则测试2
     * @param fileId 文件id
     * @return
     */
    @GetMapping("download/{fileId:^[A-Za-z0-9_-]{10,50}$}/file")
    public CommonResult testPathRegex2(@PathVariable String fileId){
        return CommonResult.ok();
    }

    /**
     * Path正则测试3
     * @param fileId 文件id
     * @return
     */
    @GetMapping(value = {"download/{fileId:^[A-Za-z0-9_-]{10,50}$}/file","download/file/{fileId:^[A-Za-z0-9_-]{10,50}$}"})
    public CommonResult testPathRegex3(@PathVariable String fileId){
        return CommonResult.ok();
    }

}
