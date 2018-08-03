package com.power.doc.entity.elasticsearch;

import java.io.Serializable;
import java.util.Date;


/**
 * Elasticsearch文档实体类
 * @author Exrickx
 */
public class EsLog implements Serializable{

    private static final long serialVersionUID = 1L;


    private String createBy;

    private Date createTime = new Date();

    private Long timeMillis = System.currentTimeMillis();

    private String updateBy;

    private Integer delFlag;

    private String name;

    private String requestUrl;

    private String requestType;

    private String requestParam;

    private String username;

    private String ip;

    private String ipInfo;

    private Integer costTime;


}
