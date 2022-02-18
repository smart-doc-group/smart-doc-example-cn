package com.power.doc.entity;

/**
 * @author yu 2022/2/18.
 */
public abstract class MidRequest<T> extends RootRequest<T> {

    @Override
    String getService() {
        return "service." + getMethod();
    }

    abstract String getMethod();
}
