package com.power.doc.enums;

/**
 * 错误代码枚举类
 * @author yu 2018/06/27
 */
public enum ErrorCodeEnum {

    SUCCESS("0000","success"),

    PARAM_EMPTY("1001","必选参数为空"),

    UNKNOWN_ERROR("0999","系统繁忙，请稍后再试....");

    private String value;

    private String desc;

    ErrorCodeEnum(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public String value() {
        return this.value;
    }


    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "[" + this.value + "]" + this.desc;
    }
}
