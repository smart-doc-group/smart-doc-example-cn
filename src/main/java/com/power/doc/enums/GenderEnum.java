package com.power.doc.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 性别数据字典
 *
 * @author yu 2019/11/10.
 */
@Getter
@RequiredArgsConstructor
public enum GenderEnum implements IEnum<Integer> {
    /**
     * 女人注释
     */
    WOMAN(0, "女人\nwewew"),
    /**
     * 男人注释
     */
    MAN(2, "男人");


    private final int code;

    private final String desc;

    @JsonValue
    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getDesc() {
        return desc;
    }
}
