package com.power.doc.enums;

/**
 * 错误代码枚举类
 *
 * @author yu 2018/06/27
 */
public enum ErrorIntegerCodeEnum {

    SUCCESS(0, "success"),

    PARAM_EMPTY(1001, "必选参数为空"),

    PARAM_ERROR(1002, "参数格式错误"),

    UNKNOWN_ERROR(9999, "系统繁忙，请稍后再试....");

    private final Integer code;

    private final String desc;

    ErrorIntegerCodeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return this.code;
    }


    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "ErrorCodeEnum{" +
                "code='" + code + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
