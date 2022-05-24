package com.power.doc.entity.page;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author <a href="mailto:cqmike0315@gmail.com" rel="nofollow">chenqi</a>
 * @version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 排序字段
     */
    private String column;

    /**
     * 是否正序
     */
    private boolean asc = true;

    public static OrderItem asc(String column) {
        return build(column, true);
    }
    public static OrderItem desc(String column) {
        return build(column, false);
    }

    public static List<OrderItem> descs(String... column) {
        return Arrays.stream(column).map(c -> build(c, false)).collect(Collectors.toList());
    }

    public static List<OrderItem> ascs(String... column) {
        return Arrays.stream(column).map(c -> build(c, true)).collect(Collectors.toList());
    }

    public static OrderItem build(String column, boolean asc) {
        return new OrderItem(column, asc);
    }
}
