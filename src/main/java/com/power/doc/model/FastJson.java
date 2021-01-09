package com.power.doc.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.power.doc.enums.DeviceDataExpressionEnum;
import com.power.doc.enums.OrderEnum;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @author yu 2018/7/10.
 */
@Data
@Accessors(chain=true)
public class FastJson {

    /**
     * 枚举
     * @mock ["2015421521","2014545545"]
     */
    private DeviceDataExpressionEnum dataExpressionEnum;

    /**
     * 菜单/权限编码
     *
     */
    private List<OrderEnum> menuPermissionCodes;

    /**
     * 学好
     * @mock 2019-01-01
     */
    private Date date;
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

    private int age;

    private Integer age2;


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
