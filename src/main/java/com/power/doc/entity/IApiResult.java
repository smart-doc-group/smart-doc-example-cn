package com.power.doc.entity;

/**
 * @author yu 2020/11/6.
 */
public interface IApiResult<T> {

    /**
     * 获取code
     * @return
     */
    String getCode();

    /**
     * 获取消息
     * @return
     */
    String getMessage();

    /**
     * 获取数据
     * @return
     */
    default T getData(){
        return null;
    }
}
