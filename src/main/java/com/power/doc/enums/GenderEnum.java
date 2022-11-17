package com.power.doc.enums;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 性别数据字典
 * @author yu 2019/11/10.
 */
public enum  GenderEnum implements IEnum<Integer> {
    /**
     * 女人注释
     */
    WOMAN(0,"女人\nwewew"),
    /**
     * 男人注释
     */
    MAN(2,"男人");
    private int code;

    private String desc;

    GenderEnum(int code,String desc){
        this.code = code;
        this.desc = desc;
    }

    @JsonValue
    public Integer getCode() {
        return this.code;
    }


    public String getDesc() {
        return desc;
    }
}
