package com.power.doc.controller.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import com.power.common.model.CommonResult;
import com.power.doc.entity.Order;
import com.power.doc.enums.GenderEnum;
import com.power.doc.enums.IEnum;
import com.power.doc.enums.OrderEnum;
import com.power.doc.enums.SimpleEnum;
import java.util.List;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 内部枚举参数测试
 * @author Jason Kung
 * @date 2024/11/27 11:05
 */
@RestController
public class InnerEnumController {

    /**
     * 测试query参数枚举
     * @param innerEnum 内部枚举
     * @return 结果
     */
    @GetMapping("/innerEnum/testQueryEnum")
    public CommonResult<InnerEnum> testQueryEnum(@RequestParam InnerEnum innerEnum) {
        return null;
    }

    /**
     * 测试post参数枚举
     * @param innerEnum 内部枚举
     * @return 结果
     */
    @PostMapping("/innerEnum/testPostEnum")
    public CommonResult<InnerEnum> testPostEnum(@RequestParam InnerEnum innerEnum) {
        return null;
    }

    /**
     * 测试body参数枚举
     * @param innerClass 内部类
     * @return 结果
     */
    @PostMapping("/innerEnum/testBodyEnum")
    public CommonResult<InnerClass> testBodyEnum(@RequestBody InnerClass innerClass) {
        return null;
    }

    /**
     * 测试query+body参数枚举
     * @param innerEnum  内部枚举参数
     * @param innerClass 内部类
     * @return 结果
     */
    @PostMapping("/innerEnum/testBodyEnum")
    public CommonResult<InnerClass> testQueryAndBodyEnum(@RequestParam InnerEnum innerEnum,
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
         * 内部枚举参数
         */
        private InnerEnum innerEnum;
    }

    /**
     * 内部枚举
     * @author jason 2024/11/27.
     */
    public enum InnerEnum implements IEnum<Integer> {
        /**
         * 内部1
         */
        INNER1(1, "内部1"),
        /**
         * 内部2
         */
        INNER2(2, "内部2");

        private int code;

        private String desc;

        InnerEnum(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        @Override
        @JsonValue
        public Integer getCode() {
            return this.code;
        }

        @Override
        public String getDesc() {
            return desc;
        }
    }
}
