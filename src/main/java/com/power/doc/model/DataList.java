package com.power.doc.model;

import java.util.Collection;

public class DataList<T> {

    private Collection<T> list;

    public Collection<T> getList() {
        return list;
    }

    public void setList(Collection<T> list) {
        this.list = list;
    }
}
