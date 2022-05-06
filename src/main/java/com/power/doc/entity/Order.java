package com.power.doc.entity;

import com.power.doc.enums.OrderEnum;

import java.util.List;

/**
 * @author yu 2020/6/20.
 */
public class Order {

    /**
     * 订单id
     */
    private int orderId;

    /**
     * 订单类型
     */
    private OrderEnum orderType;

    /**
     * 订单类型数组
     */
    private List<OrderEnum> orderEnums;
}
