package com.power.doc.entity;

/**
 * @author yu 2020/11/6.
 */
public class BaseResult {

    /**
     * ok: 接口业务成功返回
     * 其他返回表示相应的错误提示
     */
    private String message;
    /**
     * 0: 表示业务正常返回
     * 非0: 则表示业务异常, msg会有相应的异常信息
     */
    private String code;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
