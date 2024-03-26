package com.power.doc.dubbo;


import com.power.doc.entity.BasePager;

/**
 * dubbo接口A
 *
 */
public interface DubboB extends DubboA<BasePager>{
    /**
     * sayHelloB
     */
    void sayHelloB();
}
