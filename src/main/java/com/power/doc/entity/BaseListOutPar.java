package com.power.doc.entity;

import lombok.Data;

import jakarta.validation.constraints.NotNull;
import java.util.List;

/**
 * 公共列表出参
 *
 * @author: 
 * @date: 2022/9/28 20:31
 */
@Data
public class BaseListOutPar<T> {
    /**
     * 结果集
     */
    private List<T> result;

    /**
     * 分页 每页条数
     */
    @NotNull
    private int pageSize;
    /**
     * 分页 页数
     */
    @NotNull
    private int pageNum;
    /**
     * 分页 总条数
     */
    @NotNull
    private long Total;
}
