package com.power.doc.entity;

import lombok.Data;

import java.util.List;

/**
 * @author abing
 * @date 2023/8/11
 */
@Data
public class InnerClassGicVO<T> {

    ActualInnerClass<T> filed1;

    String filed2;

    @Data
    public class ActualInnerClass<C> {
        List<C> innerFiled1;
        String innerFiled2;
    }
}
