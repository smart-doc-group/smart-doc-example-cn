package com.power.doc.dubbo;

import com.github.pagehelper.PageInfo;
import com.power.common.model.CommonResult;
import com.power.doc.model.UserDetail;

/**
 * @dubbo
 * @author yu 2020/7/29.
 */
public interface DubboInterface {

    public CommonResult<PageInfo<UserDetail>> testConstantsRequestParams();
}
