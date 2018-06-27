package com.power.doc.enums;

/**
 * 错误代码枚举类
 * @author yu 2018/06/27
 */
public enum ErrorCodeEnum {

    NULL_OBJ("0001","对象为空"),
    ERROR_ADD_USER("0002","添加用户失败"),
    UNKNOWN_ERROR("0999","系统繁忙，请稍后再试....");

    private String value;
    private String desc;

    private ErrorCodeEnum(String value, String desc) {
        this.setValue(value);
        this.setDesc(desc);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "[" + this.value + "]" + this.desc;
    }
}
