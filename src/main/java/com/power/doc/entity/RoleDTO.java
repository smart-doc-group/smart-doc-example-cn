package com.power.doc.entity;

import lombok.Data;

/**
 * 角色
 *
 * @author: 王军
 * @version: 0.0.1V
 * @date: 2017/10/17 16:15
 **/
@Data
public class RoleDTO {

    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * 角色名称
     */
    private String roleName;
}
