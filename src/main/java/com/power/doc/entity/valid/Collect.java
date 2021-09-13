package com.power.doc.entity.valid;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * @author yu 2020/1/27.
 */
@Data
public class Collect {

    /**
     * 主键id
     */
    @Null(groups = {SaveAction.class}, message = "id必须为空")
    @NotNull(groups = {Login.class}, message = "id不能为空")
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 电话
     */
    @NotBlank(groups = {SendCode.class, Login.class, SignUp.class}, message = "电话不能为空")
    private String mobile;

    public interface SendCode {

    }

    public interface Login extends SendCode {

    }

    public interface SignUp extends SendCode {

    }
}
