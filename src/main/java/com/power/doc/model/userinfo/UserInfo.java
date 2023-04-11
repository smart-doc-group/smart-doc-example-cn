package com.power.doc.model.userinfo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author ziro
 */
@Data
public class UserInfo<K,V> implements Serializable {

    /**
     * 用户名称
     */
    private String username;

    /**
     * 年龄
     */
    private int age;

    /**
     * 爱好
     */
    private List<String> hobby;

    /**
     * 联系方式
     * eg: {
     *     "phone":["138xxxx","151xxxx"],
     *     "email":["123@qq.com","5959@163.com"]
     * }
     * OR
     * {
     *     "phone":"138xxxx",
     *     "email":"123@qq.com"
     * }
     */
    private Map<K,V> contact;

}
