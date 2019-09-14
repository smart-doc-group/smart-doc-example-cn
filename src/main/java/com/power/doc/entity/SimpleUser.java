package com.power.doc.entity;

import javax.validation.constraints.NotNull;

/**
 * @author yu 2018/8/4.
 */
public class SimpleUser {

    /**
     * 用户名
     * @since v1.0
     */
    @NotNull
    private String username;

    /**
     * 密码
     * @since v1.0
     */
    private String password;

    /**
     * 昵称
     * @since v1.0
     */
    private String nickName;

    /**
     * 电话
     * @since v1.0
     */
    private String mobile;

}
