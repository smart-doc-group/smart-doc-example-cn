package com.power.doc.entity.issue.plugin12;

/**
 * @author xingzi
 * @param <T>
 * @param <R>
 */

public class InteractiveProtocol<T,R> {
    /**
     * 通信协议信息
     */
    private Header header;

    /**
     * 请求体
     */
    private Body<T, R> body;
}
