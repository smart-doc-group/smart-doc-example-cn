package com.power.doc.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * BaseController
 *
 * @author yu on 2018/07/07.
 */
public abstract class BaseController<T> {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseController.class);


    /**
     * 分页查询
     *
     * @param $filter
     * @param $page
     * @param $size
     * @param $orderby
     * @return
     */
    @PostMapping(value = "/list")
    public T getPageList(@RequestBody T t) {

        return null;
    }
}