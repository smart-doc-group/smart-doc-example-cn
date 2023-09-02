package com.power.doc.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

public class GetMethodGenericType {

    public static void main(String[] args) {
        try {
            Class c = Class.forName("org.springframework.data.domain.Slice");
            Method m = c.getDeclaredMethod("getContent");
            System.out.println("methodName:" + m.getName());
            System.out.println("modifiers:" + m.getModifiers());
            //获取到范型的方法名
            Type t = m.getGenericReturnType();
            System.out.println("method type:" + t.getTypeName());

        } catch (NoSuchMethodException | ClassNotFoundException e) {
            e.fillInStackTrace();
        }
    }
}
