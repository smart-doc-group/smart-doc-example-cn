package com.power.doc.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Exrickx
 */

public abstract class XbootBaseEntity implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 自增编号
     */
    private String id;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人
     */
    private String updateBy;

    /**
     * 修改时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /**
     * 删除标记[1表示已删除，默认值0]
     */
    private Integer delFlag;
}
