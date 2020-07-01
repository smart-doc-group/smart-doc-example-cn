package com.power.doc.entity;

import lombok.Data;

/**
 * @author yu 2019/12/18.
 */
@Data
public class BasePager {

    /**
     * 当前页
     * @ignore
     */
    private int concurrentPage;

    /**
     * 当前page
     * @ignore
     */
    private int pageSize;
}
