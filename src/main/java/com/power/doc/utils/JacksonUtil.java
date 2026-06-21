package com.power.doc.utils;

import tools.jackson.core.JacksonException;
import tools.jackson.databind.JavaType;
import tools.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Map;

/**
 * @author yu 2021/7/11.
 */
public class JacksonUtil {

    private static ObjectMapper mapper = new ObjectMapper();

    public static String bean2Json(Object data) {
        try {
            String result = mapper.writeValueAsString(data);
            return result;
        } catch (JacksonException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> T json2Bean(String jsonData, Class<T> beanType) {
        try {
            T result = mapper.readValue(jsonData, beanType);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static <T> List<T> json2List(String jsonData, Class<T> beanType) {
        JavaType javaType = mapper.getTypeFactory().constructParametricType(List.class, beanType);

        try {
            List<T> resultList = mapper.readValue(jsonData, javaType);
            return resultList;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static <K, V> Map<K, V> json2Map(String jsonData, Class<K> keyType, Class<V> valueType) {
        JavaType javaType = mapper.getTypeFactory().constructMapType(Map.class, keyType, valueType);
        try {
            Map<K, V> resultMap = mapper.readValue(jsonData, javaType);
            return resultMap;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
