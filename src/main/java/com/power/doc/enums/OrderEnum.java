package com.power.doc.enums;

/**
 * 订单状态
 * @author yu 2019/11/5.
 */
public enum OrderEnum {
    /**
     *  描述1
     */
    WAIT_PAY("0", "等待支付"),

    PAID("1", "已支付"),

    EXPIRED("2","已经失效");

    private String code;

    private String desc;

    OrderEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return this.code;
    }


    public String getDesc() {
        return this.desc;
    }
}
