package com.power.doc.entity.page;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author <a href="mailto:cqmike0315@gmail.com" rel="nofollow">chenqi</a>
 * @version 1.0
 */
public class Page<T> implements IPage<T> {

    private static final long serialVersionUID = 3243243112323232122L;


    /**
     * 记录数据
     */
    protected List<T> records = Collections.emptyList();

    /**
     * 排序字段
     */
    protected List<OrderItem> orders = new ArrayList<>();

    /**
     * 总数
     */
    protected long total = 0;

    protected long size = 10;


    public void setOrders(List<OrderItem> orders) {
        this.orders = orders;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public List<T> getRecords() {
        return records;
    }

    public Page<T> setRecords(List<T> records) {
        this.records = records;
        return this;
    }

    @Override
    public List<T> records() {
        return records;
    }

    @Override
    public List<OrderItem> orders() {
        return orders;
    }
}
