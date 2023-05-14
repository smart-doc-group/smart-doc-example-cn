package com.power.doc.dubbo;

import java.util.List;

public interface DubboA<T>{
    Integer common(T param);

    void common2(List<T> result);

    T common3(List<T> result);
}
