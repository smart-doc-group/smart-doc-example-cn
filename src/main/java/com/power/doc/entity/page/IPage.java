package com.power.doc.entity.page;

import java.io.Serializable;
import java.util.List;

/**
 * @author <a href="mailto:cqmike0315@gmail.com" rel="nofollow">chenqi</a>
 * @version 1.0
 */
public interface IPage<T> extends Serializable {

    List<T> records();

    /**
     * 获取排序字段
     *
     * @author chen qi
     * @since 1.0.0
     * @return
     */
    List<OrderItem> orders();

    default boolean optimizeCountSql() {
        return true;
    }

    default boolean optimizeJoinOfCountSql() {
        return true;
    }

    default boolean searchCount() {
        return true;
    }
}
