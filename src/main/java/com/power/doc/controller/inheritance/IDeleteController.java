package com.power.doc.controller.parent;

import java.io.Serializable;

import com.power.common.model.CommonResult;
import com.power.doc.entity.SimpleUser;

/**
 * @author xingzi
 * @date 2021/6/27 13:29
 **/
public interface IDeleteController<T> {

    CommonResult deleteById(Serializable id);

}
