package com.power.doc.controller;

import com.power.common.model.CommonResult;
import org.springframework.web.bind.annotation.*;

/**
 * Path参数测试
 *
 * @author xingzi
 * @date 2019 12 11  10:10
 */
@RestController
@RequestMapping("/pathVariable")
public class PathVariableController {


    /**
     * 日志查询测试GET路径参数
     *
     * @param testData 测试路径参数
     * @return 翻页查询结果对象
     * @apiNote 你好生活，
     * 这里是中央电视台
     */
    @GetMapping("/list/{testData}")
    public void listTest(@PathVariable String testData) {

    }


    /**
     * 接收数组类型pathVariable
     *
     * @param id
     * @return
     */
    @GetMapping("/test/{id}")
    public CommonResult testPathVariable(@PathVariable("id") String[] id) {
        return CommonResult.ok(id);
    }

    /**
     * 普通path
     *
     * @param userId 用户id
     * @return
     */
    @PostMapping("/{userId}/department")
    public CommonResult testPathVariable2(@PathVariable("userId") String userId) {
        return CommonResult.ok();
    }

    /**
     * Path正则测试1
     *
     * @param fileId 文件id
     * @return
     */
    @GetMapping("download/{fileId:^[A-Za-z0-9_-]{10,50}$}")
    public CommonResult testPathRegex1(@PathVariable String fileId) {
        return CommonResult.ok();
    }

    /**
     * Path正则测试2
     *
     * @param fileId 文件id
     * @return
     */
    @GetMapping("download/{fileId:^[A-Za-z0-9_-]{10,50}$}/file")
    public CommonResult testPathRegex2(@PathVariable String fileId) {
        return CommonResult.ok();
    }

    /**
     * Path正则测试3
     *
     * @param fileId 文件id
     * @return
     */
    @GetMapping(value = {"download/{fileId:^[A-Za-z0-9_-]{10,50}$}/file", "download/file/{fileId:^[A-Za-z0-9_-]{10,50}$}"})
    public CommonResult testPathRegex3(@PathVariable String fileId) {
        return CommonResult.ok();
    }


    /**
     * 创建部门群
     *
     * @param departmentId 部门 ID
     * @param mobile       用户手机号码
     * @return 返回结果
     * @author xxx
     * @since 1.0.0
     */
    @PutMapping("/department/{departmentId}/{mobile}")
    @ResponseBody
    public CommonResult putDepartment(@PathVariable Long departmentId, @PathVariable String mobile) {
        return null;
    }
}
