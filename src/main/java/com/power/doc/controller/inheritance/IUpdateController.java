package com.power.doc.controller.inheritance;

import com.power.common.model.CommonResult;

public interface IUpdateController<T> {
    CommonResult updateById(T t);
}
