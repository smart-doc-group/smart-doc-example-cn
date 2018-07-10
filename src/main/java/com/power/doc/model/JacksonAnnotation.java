package com.power.doc.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author yu 2018/7/10.
 */
public class JacksonAnnotation {

    /**
     * 用户名
     */

    @JsonProperty("name")
    private String username;


    /**
     * 身份证号
     */
    @JsonIgnore
    private String idCard;
}
