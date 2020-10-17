package com.power.doc.dubbo;

import com.github.pagehelper.PageInfo;
import com.power.common.model.CommonResult;
import com.power.doc.entity.Order;
import com.power.doc.model.UserDetail;

/**
 * dubbo接口测试
 * @dubbo
 * @author yu 2020/7/29.
 */
public interface DubboInterface {

    /**
     * 测试
     * @return
     */
    CommonResult<? extends Order> testConstantsRequestParams();
}
