package com.power.doc.entity;


import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * author: hcy
 * version: 1.0.0V
 * date:  2019/12/5 14:36
 * description: 分页返回工具类
 **/
@Data
@Builder
public class PageHelperUtil<T, O> {



    /**
     * 总条数
     */
    private int total;

    /**
     * 其他信息
     */
    private O other;

    /**
     *
     * 数据列表
     */
    private List<T> rows;
}
