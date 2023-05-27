package com.power.doc.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author yu 2018/7/9.
 */
public class Children extends Parent {

    /**
     * 年龄
     */
    private int age;

    /**
     * 忽略覆盖父类同名字段
     */
    @JsonIgnore
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
