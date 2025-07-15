package com.power.doc.dubbo.impl;

import com.power.common.model.CommonResult;
import com.power.doc.dubbo.DubboInterface;
import com.power.doc.entity.BasePager;
import com.power.doc.entity.Order;
import com.power.doc.entity.ResultUtil;
import com.power.doc.entity.SimpleUser;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.List;

/**
 * 实现dubbo接口
 *
 * @author yusun
 * @version 2.0.0
 * @dubbo
 * @service test
 * @protocol dubbo
 */
@DubboService(interfaceName = "test", protocol = "grpc", version = "2.0.0")
public class DubboInterfaceImpl implements DubboInterface {
    @Override
    public Order testConstantsRequestParam(Order orderList) {
        return null;
    }

    @Override
    public Order testConstantsRequestParam(Order order, String aa) {
        return null;
    }

    /**
     * 测试方法testConstantsRequestParam333
     *
     * @param order order
     * @param aa    aa
     * @return dfd
     */
    public Order testConstantsRequestParam333(Order order, String aa) {
        return null;
    }

    @Override
    public CommonResult<Order> testConstantsRequestParams(ResultUtil<Order>[] orderList) {
        return null;
    }

    @Override
    public CommonResult<List<Order>> testConstantsRequestParams2(List<Order> orderList) {
        return null;
    }

    @Override
    public CommonResult<SimpleUser> testSetParams(SimpleUser simpleUser) {
        return null;
    }

    @Override
    public void sayHelloC() {

    }

    @Override
    public void sayHelloB() {

    }

    @Override
    public Integer common(BasePager param) {
        return 0;
    }

    @Override
    public void common2(List<BasePager> result) {

    }

    @Override
    public BasePager common3(List<BasePager> result) {
        return null;
    }
}
