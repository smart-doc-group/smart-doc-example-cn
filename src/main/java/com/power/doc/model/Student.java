package com.power.doc.model;


import java.util.Map;
import java.util.TreeSet;

/**
 * Description:
 * 学生信息
 *
 * @author yu 2018/06/11.
 */
public class Student {

    /**
     * 姓名
     */
    private String stuName;

    /**
     * 年龄
     */
    private Boolean stuAge;

    /**
     * 地址
     */
    private String stuAddress;

    /**
     * 用户对象
     */
    private User user;

    /**
     * map用户信息
     */
    private Map<String, User> userMap;

    /**
     * 用户列表
     */
    private TreeSet<User> userTreeSet;
    /**
     * 用户对象2
     */
    private User user1;
}


