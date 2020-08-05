package com.power.doc.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    private Integer size;
}
