package com.power.doc.model;

/**
 * Description:
 * 父类
 *
 * @author yu 2018/07/09.
 */
public class Parent implements IParent{

    /**
     * 姓名
     */
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return 0;
    }
}
