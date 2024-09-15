package com.power.doc.reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class GetMethodGenericType {

    @Test
    public void test() {
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
