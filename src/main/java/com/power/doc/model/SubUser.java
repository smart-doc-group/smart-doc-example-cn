package com.power.doc.model;

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
     */
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
