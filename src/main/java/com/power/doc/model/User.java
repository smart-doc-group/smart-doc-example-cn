package com.power.doc.model;

import java.util.List;

/**
 * Description:
 * 用户对象
 *
 * @author yu 2018/06/12.
 */
public class User {

    /**
     * 用户详情
     */
    private List<UserDetail> userDetails;

    /**
     * 用户列表
     */
    private List<User> userList;
    /**
     * 用户名
     */
    private String userName;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 用户地址
     */
    private String userAddress;

    /**
     * 用户年龄
     */
    private int userAge;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 钱少
     */
    private Float small;

    /**
     * 钱太多了
     */
    private Double money;

    /**
     * ipv6
     */
    private String ipv6;

    /**
     * 固定电话
     */
    private String telephone;



//    /**
//     * 子用户信息
//     */
//    private SubUser subUser;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getIpv6() {
        return ipv6;
    }

    public void setIpv6(String ipv6) {
        this.ipv6 = ipv6;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

//    public SubUser getSubUser() {
//        return subUser;
//    }
//
//    public void setSubUser(SubUser subUser) {
//        this.subUser = subUser;
//    }
}
