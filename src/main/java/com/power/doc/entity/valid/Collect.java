package com.power.doc.entity.valid;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

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
    @NotBlank(groups = {SaveAction.class}, message = "名称不能为空")
    private String name;

    /**
     * 电话
     */
    @NotBlank(groups = {SendCode.class, Login.class, SignUp.class}, message = "电话不能为空")
    private String mobile;

    /**
     * 地址
     */
    @NotBlank(message = "地址不能为空", groups = {Collect.add.class})
    private String address;

    public interface SendCode {

    }

    public interface Login extends SendCode {

    }

    public interface SignUp extends SendCode {

    }
}
