package com.power.doc.entity.issue.plugin12;


import lombok.Data;

@Data
public class Head {
    /**
     * 协议版本号
     */
    private Integer protocol;

    /**
     * 在线id
     */
    private String onlineId;

    /**
     * 请求时间
     */
    private String timestamp;

    /**
     * 请求流水号
     */
    private String serialNumber;

    /**
     * 操作类型
     */
    private Integer operationType;

    /**
     * 操作码
     */
    private Integer operationCode;

    /**
     * 数据
     */
    private String terminal;
}
