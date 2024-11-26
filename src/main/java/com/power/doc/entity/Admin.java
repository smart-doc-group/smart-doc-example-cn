package com.power.doc.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author yu3.sun on 2022/3/29
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Admin extends BizEntity<Long> {
    /**
     * 头像地址
     */
    private String headUrl;
}
