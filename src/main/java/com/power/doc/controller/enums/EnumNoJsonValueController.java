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
 * 枚举无JsonValue参数测试
 * @author Jason Kung
 * @date 2024/11/27 11:05
 */
@RestController
public class EnumNoJsonValueController {

    /**
     * 测试header参数枚举
     * @param noJsonValueEnum     无JsonValue枚举
     * @return 结果
     */
    @GetMapping("/enumNoJsonValue/testHeaderEnum")
    public CommonResult<NoJsonValueEnum> testHeaderEnum(@RequestHeader NoJsonValueEnum noJsonValueEnum) {
        return null;
    }

    /**
     * 测试path参数枚举
     * @param noJsonValueEnum     无JsonValue枚举
     * @return 结果
     */
    @GetMapping("/enumNoJsonValue/testPathEnum/{noJsonValueEnum}")
    public CommonResult<NoJsonValueEnum> testPathEnum(@PathVariable NoJsonValueEnum noJsonValueEnum) {
        return null;
    }

    /**
     * 测试query参数枚举
     * @param noJsonValueEnum     无JsonValue枚举
     * @param noJsonValueEnumList 无JsonValue枚举列表
     * @return 结果
     */
    @GetMapping("/enumNoJsonValue/testQueryEnum")
    public CommonResult<NoJsonValueEnum> testQueryEnum(@RequestParam NoJsonValueEnum noJsonValueEnum,
            @RequestParam List<NoJsonValueEnum> noJsonValueEnumList) {
        return null;
    }

    /**
     * 测试post参数枚举
     * @param noJsonValueEnum     无JsonValue枚举
     * @param noJsonValueEnumList 无JsonValue枚举列表
     * @return 结果
     */
    @PostMapping("/enumNoJsonValue/testPostEnum")
    public CommonResult<NoJsonValueEnum> testPostEnum(@RequestParam NoJsonValueEnum noJsonValueEnum,
            @RequestParam List<NoJsonValueEnum> noJsonValueEnumList) {
        return null;
    }

    /**
     * 测试body参数枚举
     * @param innerClass 内部类
     * @return 结果
     */
    @PostMapping("/enumNoJsonValue/testBodyEnum")
    public CommonResult<InnerClass> testBodyEnum(@RequestBody InnerClass innerClass) {
        return null;
    }

    /**
     * 测试query+body参数枚举
     * @param noJsonValueEnum     无JsonValue枚举参数
     * @param noJsonValueEnumList 无JsonValue枚举列表
     * @param innerClass    内部类
     * @return 结果
     */
    @PostMapping("/enumNoJsonValue/testQueryAndBodyEnum")
    public CommonResult<InnerClass> testQueryAndBodyEnum(@RequestParam NoJsonValueEnum noJsonValueEnum,
            @RequestParam List<NoJsonValueEnum> noJsonValueEnumList,
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
         * 无JsonValue枚举参数
         */
        private NoJsonValueEnum noJsonValueEnum;
        /**
         * 无JsonValue枚举列表
         */
        private List<NoJsonValueEnum> noJsonValueEnumList;
    }

    /**
     * 无JsonValue枚举
     * @author jason 2024/11/27.
     */
    public enum NoJsonValueEnum {
        /**
         * 内部1
         */
        INNER1(1, "内部1"),
        /**
         * 内部2
         */
        INNER2(2, "内部2");

        private int id;

        private String text;

        NoJsonValueEnum(int id, String text) {
            this.id = id;
            this.text = text;
        }

        public Integer getId() {
            return this.id;
        }

        public String getText() {
            return text;
        }
    }
}
