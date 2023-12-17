package com.power.doc.dubbo;

import java.util.List;

public interface DubboA<T>{

    /**
     * Common接口
     * @param param
     * @return
     */
    Integer common(T param);

    /**
     * Common接口2
     * @param result
     */
    void common2(List<T> result);

    /**
     * Common接口2
     * @param result
     * @return
     */
    T common3(List<T> result);
}
