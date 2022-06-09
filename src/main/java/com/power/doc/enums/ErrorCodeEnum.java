package com.power.doc.enums;

import com.power.common.interfaces.IMessage;

/**
 * 错误代码枚举类
 *
 * @author yu 2018/06/27
 */
public enum ErrorCodeEnum implements IMessage {

    SUCCESS("0000", "success\n\rsuccess"),

    PARAM_EMPTY("1001", "必选参数为空"),

    PARAM_ERROR("1002", "参数格式错误"),

    UNKNOWN_ERROR("9999", "系统繁忙，请稍后再试....");

    private String code;

    private String message;

    ErrorCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }


    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ErrorCodeEnum{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
