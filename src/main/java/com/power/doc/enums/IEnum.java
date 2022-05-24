package com.power.doc.enums;

/**
 * @author <a href="mailto:cqmike0315@gmail.com" rel="nofollow">chenqi</a>
 * @version 1.0
 */
public interface IEnum<T> {

    /**
     * 获取枚举标识
     * @return
     */
    T getCode();

    /**
     * 获取描述信息
     * @return
     */
    String getDesc();
}
