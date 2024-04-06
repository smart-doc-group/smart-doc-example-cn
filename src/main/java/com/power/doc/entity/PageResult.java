package com.power.doc.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PageResult<T> implements Serializable {
        private static final long serialVersionUID = 1L;

        /**
         * 当前页码
         */
        private Long pageNum;
        /**
         * 每页条数
         */
        private Long pageSize;
        /**
         * 总页数
         */
        private Long totalPage;
        /**
         * 总记录数
         */
        private final Long total = null;
        /**
         * 当前页数据
         */
        private final List<T> list = null;

}
