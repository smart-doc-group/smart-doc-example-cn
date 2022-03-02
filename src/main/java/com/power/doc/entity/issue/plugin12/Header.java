package com.power.doc.entity.issue.plugin12;

import lombok.Data;

@Data
public class Header {
    /**
     * 协议版本
     */
    private Integer protocol;

    /**
     * 请求时间戳
     */
    private String timestamp;

    /**
     * 请求id
     */
    private String requestId;

    /**
     * 来源
     */
    private Integer source;

    /**
     * 加密策略
     */
    private Integer strategy;

    /**
     * 状态码[0:成功 其他:失败]
     */
    private Integer statusCode;
}
