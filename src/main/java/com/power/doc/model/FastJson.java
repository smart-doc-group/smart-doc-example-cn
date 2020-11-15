package com.power.doc.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author yu 2018/7/10.
 */
@Data
@Accessors(chain=true)
public class FastJson {

    /**
     * 用户名
     */
//    @JSONField(name = "name")
    private String username;


    /**
     * 身份证号
     */
//    @JSONField(serialize = false)
    private String idCard;

    public String getUsername() {
        return username;
    }

    public FastJson setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getIdCard() {
        return idCard;
    }

    public FastJson setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }
}
