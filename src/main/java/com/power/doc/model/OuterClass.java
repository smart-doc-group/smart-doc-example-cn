package com.power.doc.model;

/**
 * 用于测试内部类解析
 * @author yu 2019/10/19.
 */
public class OuterClass {

    /**
     * 姓名
     */
    private String name;

    /**
     * 内部类
     */
    private InnerClass innerClass;

    class InnerClass {

        /**
         * 电话
         */
        private String phone;
    }
}
