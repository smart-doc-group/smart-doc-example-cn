package com.power.doc.dubbo;

import com.power.common.model.CommonResult;
import com.power.doc.entity.Order;
import com.power.doc.entity.ResultUtil;
import com.power.doc.entity.SimpleUser;

import java.util.List;

/**
 * dubbo接口测试
 * @dubbo
 * @author yu 2020/7/29.
 */
public interface DubboInterface {


    /**
     * 测试order
     * @param orderList
     * @return
     */
    Order testConstantsRequestParam(Order orderList);

    /**
     * 测试
     * @return
     */
    CommonResult<Order> testConstantsRequestParams(ResultUtil<Order>[] orderList);

    /**
     * 测试接口2
     * @param orderList
     * @return
     */
    CommonResult<List<Order>> testConstantsRequestParams2(List<Order> orderList);

    /**
     * 测试set
     */
    CommonResult<SimpleUser> testSetParams(SimpleUser simpleUser);
}
