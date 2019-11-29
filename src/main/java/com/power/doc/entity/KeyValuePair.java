package com.power.doc.entity;

import lombok.Data;

/**
 * @author yu 2019/11/29.
 */
@Data
public class KeyValuePair<K,V> {

    /**
     * key
     */
    private K key;

    /**
     * 托尔斯泰
     */
    private Object test;
    /**
     * value
     */
    private V value;

}
