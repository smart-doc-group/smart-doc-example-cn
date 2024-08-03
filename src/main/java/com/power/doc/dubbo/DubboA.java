package com.power.doc.dubbo;

import java.util.List;

public interface DubboA<T> {

    /**
     * 1Common接口 DubboA的1
     *
     * @param param
     * @return
     */
    Integer common(T param);

    /**
     * 2Common接口2 DubboA的2
     *
     * @param result
     */
    void common2(List<T> result);

    /**
     * 3Common接口2 DubboA的3
     *
     * @param result
     * @return
     */
    T common3(List<T> result);

    /**
     * 4默认新增方法
     *
     * @param entity T
     * @return T
     */
    default T save(T entity) {
        return entity;
    }
}
