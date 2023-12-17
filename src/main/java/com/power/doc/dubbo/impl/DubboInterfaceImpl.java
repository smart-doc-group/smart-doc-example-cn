package com.power.doc.dubbo.impl;

import com.power.common.model.CommonResult;
import com.power.doc.dubbo.DubboInterface;
import com.power.doc.entity.Order;
import com.power.doc.entity.ResultUtil;
import com.power.doc.entity.SimpleUser;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.List;

/**
 * 实现dubbo接口
 * @author yusun
 * @dubbo
 * @service test
 * @protocol dubbo
 * @version 2.0.0
 */
@DubboService(interfaceName = "test", protocol = "grpc",version = "2.0.0")
public class DubboInterfaceImpl implements DubboInterface {
    @Override
    public Order testConstantsRequestParam(Order orderList) {
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
}
