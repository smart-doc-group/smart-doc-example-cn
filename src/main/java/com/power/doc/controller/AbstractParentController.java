package com.power.doc.controller;

import com.power.common.model.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * AbstractParentController
 *
 * @author linwumingshi
 */
public abstract class AbstractParentController<T> {

    /**
     * getInfo by id
     *
     * @param id the id
     * @return the Info by id
     */
    @GetMapping("/{id}")
    public CommonResult<T> infoById(@PathVariable("id") String id) {
        return CommonResult.ok(info(id));
    }

    /**
     * getInfo by id
     *
     * @param id the id
     * @return the Info by id
     */
    public abstract T info(String id);
}
