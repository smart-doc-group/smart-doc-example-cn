package com.power.doc.controller.parent;

import java.io.Serializable;

import com.power.common.model.CommonResult;
import com.power.doc.entity.SimpleUser;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author xingzi
 * @date 2021/6/27 13:34
 **/
public abstract class BaseController<T> implements CommonController<T> {

    /**
     * 根据Id删除
     * @param id id
     * @return
     */
    @DeleteMapping("/deleteById/{id}")
    @Override
    public CommonResult deleteById(Serializable id) {
        return null;
    }

    /**
     * 根据Id更新
     * @param t t
     * @return
     */
    @PutMapping("/updateById")
    @Override
    public CommonResult updateById(@RequestBody T t) {
        return null;
    }
}
