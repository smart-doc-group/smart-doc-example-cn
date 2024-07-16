package com.power.doc.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.Map;

/**
 * @author <a href="mailto:cqmike0315@gmail.com" rel="nofollow">chenqi</a>
 * @version 1.0
 */
@Data
public class NestedVO {

    /**
     * 名称
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 第一个嵌套
     */
    private List<NestedOneVO> oneVOList;

    /**
     * aaa
     */
    private List<NestedOneVO> nestedTwoVOList;


    @Data
    public static class NestedOneVO {

        /**
         * 地址
         */
        private String address;

        /**
         * 一个map
         */
        private Map<String, Object> map;

        /**
         * 第二个嵌套
         */
        private List<NestedOneVO> child;
    }


    @EqualsAndHashCode(callSuper = true)
    @Data
    public static class NestedTwoVO extends NestedOneVO {
        /**
         * 年龄
         */
        private Integer age;

        /**
         * 两个map
         */
        private Map<String, Object> twoMap;
    }
}
