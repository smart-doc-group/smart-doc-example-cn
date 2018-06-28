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


    //getters and setters
    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Boolean getStuAge() {
        return stuAge;
    }

    public void setStuAge(Boolean stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public TreeSet<User> getUserTreeSet() {
        return userTreeSet;
    }

    public void setUserTreeSet(TreeSet<User> userTreeSet) {
        this.userTreeSet = userTreeSet;
    }

    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }
}


