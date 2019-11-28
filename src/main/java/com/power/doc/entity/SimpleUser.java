package com.power.doc.entity;

import com.power.doc.enums.GenderEnum;
import com.power.doc.enums.SimpleEnum;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author yu 2018/8/4.
 */
@Data
public class SimpleUser {

    /**
     * 简单枚举
     */
    private SimpleEnum simpleEnum;
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

    /**
     * 性别
     */
    private GenderEnum gender;

}
