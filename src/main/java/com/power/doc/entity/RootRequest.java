package com.power.doc.entity;

/**
 * @author yu 2022/2/18.
 */
public abstract class RootRequest<T> {

    private String appId;
    private T data;

    /**
     * 请求体
     *
     * @return
     */
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    abstract String getService();
}
