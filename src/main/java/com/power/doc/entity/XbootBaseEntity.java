package com.power.doc.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Exrickx
 */
@Data
public abstract class XbootBaseEntity<T> implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 自增编号
     * @since v1.0
     */
    private String id;

    /**
     * 创建人
     * @since v1.2
     */
    private String createBy;

    /**
     * 创建时间
     * @since v1.0
     */
    private Date createTime;

    /**
     * 修改人
     * @since v1.1
     */
    private String updateBy;

    /**
     * 修改时间
     * @since v1.1
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /**
     * 删除标记[1表示已删除，默认值0]
     * @since v1.1
     */
    private Integer delFlag;

    /**
     * 测试数据
     */
    protected T test;
}
