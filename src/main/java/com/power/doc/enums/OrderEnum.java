package com.power.doc.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 订单状态
 *
 * @author yu 2019/11/5.
 */
@Getter
@RequiredArgsConstructor
public enum OrderEnum implements IEnum<String> {
    /**
     * 描述1
     */
    WAIT_PAY("0", "等待支付"),

    PAID("1", "已支付"),

    EXPIRED("2", "已经失效");

    private final String code;

    private final String desc;
}
