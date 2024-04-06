package com.power.doc.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class Response<T>  implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 是否操作成功
     */
    private boolean success;

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 描述
     */
    private String msg;

    /**
     * 时间戳
     */
    private Long timestamp;

    /**
     * 数据
     */
    private T data;
}
