package com.power.doc.dubbo;


import com.power.doc.entity.BasePager;

/**
 * dubbo接口B 继承 dubbo接口A
 */
public interface DubboB extends DubboA<BasePager> {
    /**
     * 5 sayHelloB DubboB的1
     */
    void sayHelloB();
}
