package com.power.doc.controller.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import com.power.common.model.CommonResult;
import java.util.List;
import java.util.Map;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 枚举无数据字典测试
 * @author Jason Kung
 * @date 2024/11/27 11:05
 */
@RestController
public class EnumNoDataDictionariesController {

    /**
     * 测试header参数枚举
     * @param noDataDictionariesEnum     无数据字典枚举
     * @return 结果
     */
    @GetMapping("/enumNoDataDictionaries/testHeaderEnum")
    public CommonResult<NoDataDictionariesEnum> testHeaderEnum(@RequestHeader NoDataDictionariesEnum noDataDictionariesEnum) {
        return null;
    }

    /**
     * 测试path参数枚举
     * @param noDataDictionariesEnum     无数据字典枚举
     * @return 结果
     */
    @GetMapping("/enumNoDataDictionaries/testPathEnum/{noDataDictionariesEnum}")
    public CommonResult<NoDataDictionariesEnum> testPathEnum(@PathVariable NoDataDictionariesEnum noDataDictionariesEnum) {
        return null;
    }

    /**
     * 测试query参数枚举
     * @param noDataDictionariesEnum     无数据字典枚举
     * @param noDataDictionariesEnumList 无数据字典枚举列表
     * @return 结果
     */
    @GetMapping("/enumNoDataDictionaries/testQueryEnum")
    public CommonResult<NoDataDictionariesEnum> testQueryEnum(@RequestParam NoDataDictionariesEnum noDataDictionariesEnum,
            @RequestParam List<NoDataDictionariesEnum> noDataDictionariesEnumList) {
        return null;
    }

    /**
     * 测试post参数枚举
     * @param noDataDictionariesEnum     无数据字典枚举
     * @param noDataDictionariesEnumList 无数据字典枚举列表
     * @return 结果
     */
    @PostMapping("/enumNoDataDictionaries/testPostEnum")
    public CommonResult<NoDataDictionariesEnum> testPostEnum(@RequestParam NoDataDictionariesEnum noDataDictionariesEnum,
            @RequestParam List<NoDataDictionariesEnum> noDataDictionariesEnumList) {
        return null;
    }

    /**
     * 测试body参数枚举
     * @param innerClass 内部类
     * @return 结果
     */
    @PostMapping("/enumNoDataDictionaries/testBodyEnum")
    public CommonResult<InnerClass> testBodyEnum(@RequestBody InnerClass innerClass) {
        return null;
    }

    /**
     * 测试body map参数枚举
     * @param map 集合
     * @return 结果
     */
    @PostMapping("/enumNoDataDictionaries/testBodyMapEnum")
    public CommonResult<Map<NoDataDictionariesEnum, InnerClass>> testBodyEnum(@RequestBody Map<NoDataDictionariesEnum, InnerClass> map) {
        return CommonResult.ok(map);
    }

    /**
     * 测试query+body参数枚举
     * @param noDataDictionariesEnum     无数据字典枚举参数
     * @param noDataDictionariesEnumList 无数据字典枚举列表
     * @param innerClass    内部类
     * @return 结果
     */
    @PostMapping("/enumNoDataDictionaries/testQueryAndBodyEnum")
    public CommonResult<InnerClass> testQueryAndBodyEnum(@RequestParam NoDataDictionariesEnum noDataDictionariesEnum,
            @RequestParam List<NoDataDictionariesEnum> noDataDictionariesEnumList,
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
         * 无数据字典枚举参数
         */
        private NoDataDictionariesEnum noDataDictionariesEnum;
        /**
         * 无数据字典枚举列表
         */
        private List<NoDataDictionariesEnum> noDataDictionariesEnumList;
    }

    /**
     * 无数据字典枚举
     * @author jason 2024/11/27.
     */
    public enum NoDataDictionariesEnum {
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

        NoDataDictionariesEnum(int id, String text) {
            this.id = id;
            this.text = text;
        }

        @JsonValue
        public Integer getId() {
            return this.id;
        }

        public String getText() {
            return text;
        }
    }
}
