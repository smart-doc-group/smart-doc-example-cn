package com.power.doc.entity;

import com.power.doc.enums.GenderEnum;
import com.power.doc.enums.SimpleEnum;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author yu 2018/8/4.
 */
@Data
public class SimpleUser {

    private final static int AGE = 100;

    private final int   MAX_SPEED = 120;

    /**
     * 性别
     */
    private GenderEnum gender;
    /**
     * 简单枚举
     */
    private SimpleEnum simpleEnum;
    /**
     * 用户名
     * @since v1.0
     */
    @Size(min = 1,max = 3)
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



    public SimpleEnum getSimpleEnum() {
        return simpleEnum;
    }

    public void setSimpleEnum(SimpleEnum simpleEnum) {
        this.simpleEnum = simpleEnum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }
}
