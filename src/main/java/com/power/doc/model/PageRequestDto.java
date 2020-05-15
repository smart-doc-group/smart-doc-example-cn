package com.power.doc.model;

import lombok.Data;

/**
 * @author yu 2020/5/15.
 */
@Data
public class PageRequestDto {

    /**
     * 页码
     */
    private Integer page;

    /**
     * 页面大小
     */
    private Integer size;
}
