package com.power.doc.controller.parent;

import com.power.doc.entity.XbootBaseEntity;
import com.power.doc.service.BaseCustomHandlerService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * 基础Controller，提供通用curd方法
 *
 * @author yangyang
 * @date 2023/4/23
 */
public abstract class BaseCustomHandlerController<T extends BaseCustomHandlerService> {
    @Autowired
    private T service;

    /**
     * 查询列表
     * @return
     */
    @GetMapping()
    public List findList() {
        return service.findList();
    }

    /**
     * 创建实例
     * @param request
     */
    @PostMapping()
    public void create(HttpServletRequest request) {
        XbootBaseEntity t = service.newEntity();
        /**
         * 通过request中的数据信息进行绑定
         */
        service.create(t);
    }
}
