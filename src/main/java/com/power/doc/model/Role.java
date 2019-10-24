package com.power.doc.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yu 2019/10/24.
 */
public class Role {

    /**
     * 角色编号
     */
    private String id;

    /**
     * 多对多
     * 查询权限时使用，同一角色可能对应多个用户
     */
    private Set<MyUser> users = new HashSet<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Set<MyUser> getUsers() {
        return users;
    }

    public void setUsers(Set<MyUser> users) {
        this.users = users;
    }
}
