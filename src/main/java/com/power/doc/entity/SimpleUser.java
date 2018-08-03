package com.power.doc.entity;

import javax.validation.constraints.NotNull;

/**
 * @author yu 2018/8/4.
 */
public class SimpleUser {

    /**
     * 用户名
     */
    @NotNull
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 电话
     */
    private String mobile;

}
