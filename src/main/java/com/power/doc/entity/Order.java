package com.power.doc.entity;

import com.power.doc.enums.OrderEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

/**
 * @author yu 2020/6/20.
 */
@Getter
@Setter
public class Order {

    /**
     * 订单类型数组
     */
    private Set<OrderEnum> orderEnumSet;

    /**
     * 订单id
     */
    private int orderId;

    /**
     * 订单类型
     */
    private OrderEnum orderType = OrderEnum.EXPIRED;


    /**
     * 测试订单类型
     * @see OrderEnum
     */
    private String testSee;

    /**
     * 订单类型数组
     */
    private List<OrderEnum> orderEnums;
}
