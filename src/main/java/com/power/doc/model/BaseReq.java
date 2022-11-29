package com.power.doc.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * @author yu 2018/12/20.
 */
public class BaseReq<T> {

    /**
     * token
     */
    @NotBlank(message = "token不能为空")
    private String token;

    /**
     * 序列号
     */
    @NotBlank(message = "sequenceNo不能为空")
    private String sequenceNo;

//    @NotNull(message = "parameter不能为空")
    @Valid
    private T parameter;


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(String sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public T getParameter() {
        return parameter;
    }

    public void setParameter(T parameter) {
        this.parameter = parameter;
    }
}
