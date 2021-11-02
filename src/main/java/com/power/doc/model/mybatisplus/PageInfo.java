package com.power.doc.model.mybatisplus;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * @author yu 2020/12/25.
 */
public class PageInfo<T> implements IPage<T> , Serializable {



    /**
     * 总数
     */
    private long count;

    /**
     * 分页数据
     */
    private List<T> records = Collections.emptyList();

    /**
     * 当前页码
     */
    private long page;

    /**
     * 每页显示条数
     */
    private long size;

    public PageInfo() {

    }

    public PageInfo(long page, long size) {
        if (page <= 0) {
            this.page = 1;
        } else {
            this.page = page;
        }

        if (size <= 0) {
            this.size = 10;
        } else if (size > 50) {
            this.size = 50;
        } else  {
            this.size = size;
        }
    }

    /**
     * PageInfo之间转换，页码、总数等不变，只替换records
     *
     * @param records 最终数据
     * @param srcPage 原PageInfo对象
     * @return 新类别的PageInfo
     */
    public PageInfo<T> build(List<T> records, PageInfo<?> srcPage) {
        PageInfo<T> pageInfo = new PageInfo<>();

        pageInfo.setPages(srcPage.getPages());
        pageInfo.setCurrent(srcPage.getCurrent());
        pageInfo.setSize(srcPage.getSize());
        pageInfo.setTotal(srcPage.getTotal());
        pageInfo.setRecords(records);

        return pageInfo;
    }

    @Override
    public List<OrderItem> orders() {
        return null;
    }

    @Override
    public List<T> getRecords() {
        return this.records;
    }

    @Override
    public IPage<T> setRecords(List<T> records) {
        this.records = records;
        return this;
    }

    /**
     * 获取总记录
     * @return
     */
    @Override
    public long getTotal() {
        return this.count;
    }

    @Override
    public IPage<T> setTotal(long total) {
        this.count = total;
        return this;
    }

    @JsonIgnore
    @Override
    public long getSize() {
        return this.size;
    }

    @Override
    public IPage<T> setSize(long size) {
        this.size = size;
        return this;
    }

    @JsonIgnore
    @Override
    public long getCurrent() {
        return this.page;
    }

    @Override
    public IPage<T> setCurrent(long current) {
        this.page = current;
        return this;
    }

    @JsonIgnore
    @Override
    public boolean searchCount() {
        return count >= 0;
    }

    @Override
    public boolean optimizeCountSql() {
        return true;
    }

    @JsonIgnore
    @Override
    public long getPages() {
        if (getSize() == 0) {
            return 0L;
        }
        long pages = getTotal() / getSize();
        if (getTotal() % getSize() != 0) {
            pages++;
        }
        return pages;
    }
}