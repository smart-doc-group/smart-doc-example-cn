package com.power.doc.entity;

import lombok.Data;

import java.util.List;

/**
 * @author xingzi  2020/07/01  16:34
 */
@Data
public class Result<T,K> {

    private T data;
    private List<K>  data1;
    private List<T> data2;
    private K data3;
}
