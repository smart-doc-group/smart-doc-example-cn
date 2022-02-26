package com.power.doc.entity;

import lombok.Data;

import java.util.HashMap;

/**
 * @author yu 2022/2/19.
 */
public class GetMainGoodsByItemNosBody  {

    @Data
    public static class GetMainGoodsByItemNosInfo  {
        /**
         * 商品名称
         */
        private String goods_name;
    }
}
