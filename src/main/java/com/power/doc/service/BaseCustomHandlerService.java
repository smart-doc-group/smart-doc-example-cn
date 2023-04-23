package com.power.doc.service;

import com.power.doc.entity.XbootBaseEntity;
import jakarta.annotation.PostConstruct;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

/**
 * 基础Service，提供通用curd方法
 * 此处泛型值传递T，即Entity信息，实际场景中传递的泛型要更多
 *
 * @author yangyang
 * @date 2023/4/23
 */
public abstract class BaseCustomHandlerService<T extends XbootBaseEntity> {
    private Class<T> entityClass;

    /**
     * 构造函数，获取类型信息
     */
    @PostConstruct
    public void init() {
        entityClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    /**
     * 查询列表
     *
     * @return
     */
    public List<T> findList() {
        return new ArrayList<>();
    }

    /**
     * 创建
     *
     * @param entity
     */
    public void create(T entity) {

    }

    public Class<T> getEntityClass() {
        return entityClass;
    }

    /**
     * 通过 T 的类型信息实例化
     * @return
     */
    public T newEntity() {
        return null;
    }
}
