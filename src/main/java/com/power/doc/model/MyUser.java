package com.power.doc.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yu 2019/10/24.
 */
public class MyUser {

    /**
     * 用户名
     */
    private String userName;

    /**
     * 多对多
     * 查询权限时使用，同一用户可同时拥有多个角色
     */
    private Set<Role> roles = new HashSet<>();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
