package com.power.doc.entity;

import lombok.Data;

/**
 * @author yu 2019/11/29.
 */
@Data
public class KeyValuePair<K, V> {


    /**
     * 托尔斯泰
     */
    private String test;
    /**
     * value
     */
    private V value;

    /**
     * key
     */
    private K key;



}
