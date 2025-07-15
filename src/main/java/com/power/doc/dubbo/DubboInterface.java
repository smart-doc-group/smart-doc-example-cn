package com.power.doc.dubbo;

import com.power.common.model.CommonResult;
import com.power.doc.entity.Order;
import com.power.doc.entity.ResultUtil;
import com.power.doc.entity.SimpleUser;

import java.util.List;

/**
 * dubbo接口测试
 *
 * @author yu 2020/7/29.
 */
@Deprecated
public interface DubboInterface extends DubboC {


    /**
     * 测试order DubboInterfaced的1
     *
     * @param orderList
     * @return
     */
    Order testConstantsRequestParam(Order orderList);


    /**
     * 8测试order 重载 DubboInterfaced的2
     *
     * @param order
     * @param aa    aa
     * @return
     */
    Order testConstantsRequestParam(Order order, String aa);

    /**
     * 测试 DubboInterfaced的3
     *
     * @return
     */
    CommonResult<Order> testConstantsRequestParams(ResultUtil<Order>[] orderList);

    /**
     * 测试接口2 DubboInterfaced的4
     *
     * @param orderList
     * @return
     */
    CommonResult<List<Order>> testConstantsRequestParams2(List<Order> orderList);

    /**
     * 测试set DubboInterfaced的5
     */
    CommonResult<SimpleUser> testSetParams(SimpleUser simpleUser);
}
