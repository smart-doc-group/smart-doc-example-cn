package com.power.doc.controller.parent;

import com.power.common.model.CommonResult;

public interface IUpdateController<T> {
    CommonResult updateById(T t);
}
