package com.power.doc.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

/**
 * Description:
 * 子用户
 *
 * @author yu 2018/06/15.
 */
@Setter
@Getter
public class SubUser {

    /**
     * 用户名称
     * 水水水水
     * ddddd
     *
     * @mock 张三
     */
    @NotBlank(message = "subUserName不能为空")
    private String subUserName;

    /**
     * bigInteger
     */
    private BigInteger numbers;


}
