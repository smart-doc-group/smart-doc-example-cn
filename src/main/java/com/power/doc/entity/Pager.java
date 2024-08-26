package com.power.doc.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author yu 2020/7/1.
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Pager extends BasePager {

    /**
     * 记录总数
     */
    private int total;
}
