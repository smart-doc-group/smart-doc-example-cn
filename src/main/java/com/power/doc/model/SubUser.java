package com.power.doc.model;

import javax.validation.constraints.NotBlank;
import java.math.BigInteger;

/**
 * Description:
 * 子用户
 *
 * @author yu 2018/06/15.
 */
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


    public String getSubUserName() {
        return subUserName;
    }

    public void setSubUserName(String subUserName) {
        this.subUserName = subUserName;
    }

    public BigInteger getNumbers() {
        return numbers;
    }

    public void setNumbers(BigInteger numbers) {
        this.numbers = numbers;
    }
}
