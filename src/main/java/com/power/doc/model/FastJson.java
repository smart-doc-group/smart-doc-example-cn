package com.power.doc.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author yu 2018/7/10.
 */
@Data
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
}
