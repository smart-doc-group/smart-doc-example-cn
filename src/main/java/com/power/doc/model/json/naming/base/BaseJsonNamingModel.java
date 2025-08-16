package com.power.doc.model.json.naming.base;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 命名策略测试基类。
 *
 * <p>包含所有用于验证命名策略转换的公共字段，被各种具体命名策略模型继承。
 * 通过统一字段定义，确保所有策略测试使用完全一致的字段集，便于对比分析。</p>
 *
 * <p>字段设计覆盖以下关键场景：
 * <ul>
 *     <li>标准小驼峰命名（userName）</li>
 *     <li>ID等标准缩写处理（userID）</li>
 *     <li>HTTP等多字母缩写（HTTPResponseCode）</li>
 *     <li>混合大小写场景（apiEndpointUrl）</li>
 *     <li>全大写字段（HTMLContent）</li>
 *     <li>数字与字母组合（userName123）</li>
 *     <li>特殊字符处理（json_Payload）</li>
 * </ul>
 * </p>
 *
 * @author linwumingshi
 * @version 1.0.0
 * @since 2025-08-16
 */
@Data
@SuppressWarnings("all")
public abstract class BaseJsonNamingModel implements Serializable {

    /**
     * 序列化版本标识
     */
    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 用户名称（标准小驼峰示例）
     * <p>测试基础命名转换</p>
     */
    private String userName;

    /**
     * 用户ID（标准缩写示例）
     * <p>测试ID等常见缩写的处理</p>
     */
    private String userID;

    /**
     * 用户全名（复合单词示例）
     * <p>测试多单词组合转换</p>
     */
    private String userFullName;

    /**
     * HTTP响应码（多字母缩写示例）
     * <p>测试HTTP等多字母缩写的处理</p>
     */
    private String HTTPResponseCode;

    /**
     * API端点URL（混合大小写示例）
     * <p>测试API等混合缩写的处理</p>
     */
    private String apiEndpointUrl;

    /**
     * HTML内容（多字母缩写示例）
     * <p>测试HTML等多字母缩写的处理</p>
     */
    private String HTMLContent;

    /**
     * XML数据（标准缩写示例）
     * <p>测试XML等标准缩写的处理</p>
     */
    private String xmlData;

    /**
     * 用户名含数字（数字组合示例）
     * <p>测试数字与字母组合的处理</p>
     */
    private String userName123;

    /**
     * JSON有效负载（特殊字符示例）
     * <p>测试下划线等特殊字符的处理</p>
     */
    private String json_Payload;

    /**
     * 首字母大写（特殊大小写示例）
     * <p>测试首字母大写字段的转换</p>
     */
    private String UserName;

    /**
     * 全大写字段（全大写示例）
     * <p>测试全大写字段的转换处理</p>
     */
    private String USERID;

    /**
     * 双下划线开头（特殊前缀示例）
     * <p>测试特殊前缀字段的处理</p>
     */
    private String __underscorePrefix;
}