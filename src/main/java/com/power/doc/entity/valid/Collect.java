package com.power.doc.entity.valid;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author yu 2020/1/27.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Collect extends BaseValid {

    /**
     * 主键id
     */
    @Null(groups = {SaveAction.class}, message = "id必须为空")
    @NotNull(groups = {Login.class, SendCode.class}, message = "id不能为空")
    private Long id;

    /**
     * 名称
     */
    @NotBlank(groups = {SaveAction.class, SendCode.class, UpdateAction.class}, message = "名称不能为空")
    private String name;

    /**
     * 邮箱
     * 测试继承默认分组的group
     */
    @NotBlank(groups = UpdateAction.class, message = "名邮箱不能为空")
    private String email;

    /**
     * 电话
     */
    @NotBlank(groups = {SendCode.class, Login.class, SignUp.class, TwoSaveAction.class}, message = "电话不能为空")
    private String mobile;

    /**
     * 地址
     */
    @NotBlank(message = "地址不能为空", groups = {Collect.add.class})
    private String address;

    /**
     * 城市
     */
    @NotBlank(message = "城市不能为空")
    private String city;

    /**
     * 国家
     */
    @NotBlank(message = "国家不能为空", groups = {BaseValid.edit.class})
    private String country;

    public interface SendCode {

    }

    public interface Login extends SendCode {

    }

    public interface SignUp extends SendCode {

    }
}
