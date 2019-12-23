package com.power.doc.entity;


import lombok.Builder;
import lombok.Data;

/**
 * author: hcy
 * version: 1.0.0V
 * date:  2019/12/5 14:36
 * description: 分页返回工具类
 **/
@Data
@Builder
public class PageHelperUtil<T> {
    /**
     * 总条数
     */
    private Long total;
    /**
     * 集合
     */
    private T list;
}
