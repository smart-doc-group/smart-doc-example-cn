package com.power.doc.entity;

/**
 * @author yu 2022/2/18.
 */
public class OneLevelRequest extends RootRequest<Order>{
    @Override
    String getService() {
        return "service.method";
    }
}
