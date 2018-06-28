package com.power.doc.model;

/**
 * Description:
 * 老师
 *
 * @author yu 2018/06/12.
 */
public class Teacher<T,M,K> {

    /**
     * 
     * 泛型data
     */
    private T data;

    /**
     * 泛型data1
     */
    private K data1;

    /**
     * data2
     */
    private M data2;

    /**
     * 年龄
     */
    private int age;


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public K getData1() {
        return data1;
    }

    public void setData1(K data1) {
        this.data1 = data1;
    }

    public M getData2() {
        return data2;
    }

    public void setData2(M data2) {
        this.data2 = data2;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
