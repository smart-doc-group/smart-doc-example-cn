package com.power.doc.entity;


import lombok.Data;

import java.util.List;

/**
 * @author: 程怀志
 * @Version: 0.0.1V
 * @Date: 2017/9/19
 * @Description: 管理员名称和对应的权限DTO
 **/
@Data
public class AdminRoleDTO {

    /**
     * 管理员id
     */
    private String adminId;
    /**
     * 管理员名称
     */
    private String adminName;
    /**
     * 用户头像
     */
    private String headUrl;
    /**
     * 状态
     */
    private String status;
    /**
     * 管理员角色
     */
    List<RoleDTO> roleList;
}
