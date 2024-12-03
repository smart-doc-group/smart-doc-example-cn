package com.power.doc.controller.enums;

import com.power.common.model.CommonResult;
import java.util.List;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 枚举无参数测试
 * @author Jason Kung
 * @date 2024/11/27 11:05
 */
@RestController
public class EnumNoArgumentController {

    /**
     * 测试header参数枚举
     * @param noArgumentEnum     无参数枚举
     * @return 结果
     */
    @GetMapping("/enumNoArgument/testHeaderEnum")
    public CommonResult<NoArgumentEnum> testHeaderEnum(@RequestHeader NoArgumentEnum noArgumentEnum) {
        return null;
    }

    /**
     * 测试path参数枚举
     * @param noArgumentEnum     无参数枚举
     * @return 结果
     */
    @GetMapping("/enumNoArgument/testPathEnum/{noArgumentEnum}")
    public CommonResult<NoArgumentEnum> testPathEnum(@PathVariable NoArgumentEnum noArgumentEnum) {
        return null;
    }

    /**
     * 测试query参数枚举
     * @param noArgumentEnum     无参数枚举
     * @param noArgumentEnumList 无参数枚举列表
     * @return 结果
     */
    @GetMapping("/enumNoArgument/testQueryEnum")
    public CommonResult<NoArgumentEnum> testQueryEnum(@RequestParam NoArgumentEnum noArgumentEnum,
            @RequestParam List<NoArgumentEnum> noArgumentEnumList) {
        return null;
    }

    /**
     * 测试post参数枚举
     * @param noArgumentEnum     无参数枚举
     * @param noArgumentEnumList 无参数枚举列表
     * @return 结果
     */
    @PostMapping("/enumNoArgument/testPostEnum")
    public CommonResult<NoArgumentEnum> testPostEnum(@RequestParam NoArgumentEnum noArgumentEnum,
            @RequestParam List<NoArgumentEnum> noArgumentEnumList) {
        return null;
    }

    /**
     * 测试body参数枚举
     * @param innerClass 内部类
     * @return 结果
     */
    @PostMapping("/enumNoArgument/testBodyEnum")
    public CommonResult<InnerClass> testBodyEnum(@RequestBody InnerClass innerClass) {
        return null;
    }

    /**
     * 测试query+body参数枚举
     * @param noArgumentEnum     无参数枚举参数
     * @param noArgumentEnumList 无参数枚举列表
     * @param innerClass    内部类
     * @return 结果
     */
    @PostMapping("/enumNoArgument/testQueryAndBodyEnum")
    public CommonResult<InnerClass> testQueryAndBodyEnum(@RequestParam NoArgumentEnum noArgumentEnum,
            @RequestParam List<NoArgumentEnum> noArgumentEnumList,
            @RequestBody InnerClass innerClass) {
        return null;
    }

    /**
     * 内部类
     */
    @Data
    public static class InnerClass {

        /**
         * 内部参数
         */
        private String innerParam;
        /**
         * 无参数枚举参数
         */
        private NoArgumentEnum noArgumentEnum;
        /**
         * 无参数枚举列表
         */
        private List<NoArgumentEnum> noArgumentEnumList;
    }

    /**
     * 无参数枚举
     * @author jason 2024/11/27.
     */
    public enum NoArgumentEnum {
        /**
         * 内部1
         */
        INNER1,
        /**
         * 内部2
         */
        INNER2;
    }
}
