package com.power.doc.dubbo.impl;

import com.power.doc.entity.Order;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * DubboInterfaceImpl2继承 DubboInterfaceImpl
 *
 * @author yusun
 * @version 2.0.0
 * @dubbo
 * @service test
 * @protocol dubbo
 */
@DubboService(interfaceName = "testExtend", protocol = "grpc", version = "2.0.0")
public class DubboInterfaceImplExtend extends DubboInterfaceImpl {

    /**
     * 测试方法testConstantsRequestParam333 重写 order2222 DubboInterfaceImpl2 的
     *
     * @param order2222 order2222
     * @param aa        aa
     * @return dfd
     */
    @Override
    public Order testConstantsRequestParam333(Order order2222, String aa) {
        return new Order();
    }
}
