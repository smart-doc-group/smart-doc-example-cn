package com.power.doc.reflect;

import com.power.doc.constants.ApiConstants;

import java.lang.reflect.Field;

public class ReflectionConstantsValue {
    public static void main(String[] args) {
        try {
            // 获取Test类的Class对象
            Class<?> clazz = ApiConstants.class;

            Field[] fields = clazz.getDeclaredFields();
            for(Field f:fields) {
                System.out.println("修饰："+f.getModifiers());
                // 获取字段的值
                Object constantValue = f.get(null);
                // 输出结果
                System.out.println("常量值： " + constantValue);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
