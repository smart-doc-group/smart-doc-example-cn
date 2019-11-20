package com.power.doc.enums;

/**
 * @author yu 2019/11/14.
 */
public enum  CommodityStatusEnum {
    TEMPORARY("临时"),
    WAITING_FOR_AUTHENTICATION("待审核"),
    AUTHENTICATED("审核通过");

    private String name;
    CommodityStatusEnum(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
