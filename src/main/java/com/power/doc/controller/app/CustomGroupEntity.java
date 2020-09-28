package com.power.doc.controller.app;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode()
public class CustomGroupEntity {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 人群名称
     */
    private String groupName;

    /**
     * 人群描述
     */
    private String description;

    /**
     * 人群类型
     */
    private Integer groupType;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 关联主键
     */
    private Long detailId;
}
