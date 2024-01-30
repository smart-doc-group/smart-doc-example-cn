package com.power.doc.entity.issue680;

import lombok.Data;

/**
 * 测试 json 转义响应
 * @author <a href="mailto:cqmike0315@gmail.com">chenqi</a>
 * @version 1.0
 */
@Data
public class MockEscapeJsonRes {

    /**
     * cron
     * @mock *\/5 * * * * ?
     */
    private String cron;
    /**
     * 名称（单引号）
     * @mock '我是名称'
     */
    private String quoteName;
    /**
     * 源名称
     * @mock 源名称
     */
    private String sourceName;
    /**
     * 名称（双引号）
     * @mock "我是名称"
     */
    private String quotesName;

    /**
     * 年龄
     * @mock 2
     */
    private Integer age;
}
