package com.power.doc.model;

import java.util.List;

/**
 * Description:
 * 职工信息
 *
 * @author yu 2018/06/30.
 */
public class Staff<T> {

    /**
     * 职工名称
     */
    private String name;

    /**
     * 任何信息对象
     */
    private T annyObject;

    /**
     * 泛型数据
     */
    private List<T> data;




}
