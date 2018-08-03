package com.power.doc.entity;


import java.math.BigDecimal;
import java.util.List;

public class Permission extends XbootBaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 菜单/权限名称
     */
    private String name;

    /**
     * 层级
     */
    private Integer level;

    /**
     * 类型 0页面 1具体操作
     */
    private Integer type;

    /**
     * 菜单标题
     */
    private String title;

    /**
     * 页面路径/资源链接url
     */
    private String path;

    /**
     * 前端组件
     */
    private String component;

    /**
     * 图标
     */
    private String icon;

    /**
     * 按钮权限类型
     */
    private String buttonType;

    /**
     * 父id
     */
    private String parentId;

    /**
     * 说明备注
     */
    private String description;

    /**
     * 排序值
     */
    private BigDecimal sortOrder;

    /**
     * 是否启用 0启用 -1禁用
     */
    private Integer status;

    /**
     * 子菜单/权限
     */
    private List<Permission> children;

    /**
     * 页面拥有的权限类型
     */
    private List<String> permTypes;

    /**
     * 节点展开 前端所需
     */
    private Boolean expand = true;

    /**
     * 是否勾选 前端所需
     */
    private Boolean checked = false;

    /**
     * 是否选中 前端所需
     */
    private Boolean selected = false;
}