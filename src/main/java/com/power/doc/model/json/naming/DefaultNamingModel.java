package com.power.doc.model.json.naming;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.power.doc.model.json.naming.base.BaseJsonNamingModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 默认命名策略测试模型（显式使用默认策略）。
 *
 * <p>使用@JsonNaming注解但不指定具体策略类，即使用value()的默认值。
 * 这种用法的特殊含义是"显式使用默认命名策略"，主要用于：</p>
 *
 * <ul>
 *     <li>覆盖父类或混入注解中指定的命名策略</li>
 *     <li>明确表示使用全局默认策略（小驼峰）</li>
 *     <li>在复杂继承体系中重置命名策略</li>
 * </ul>
 *
 * <p>重要说明：</p>
 * <pre>
 * {@code
 * @JsonNaming // 等同于 @JsonNaming(value = PropertyNamingStrategy.class)
 * public class DefaultNamingModel { }
 * }
 * </pre>
 *
 * <p>转换效果（使用全局默认的小驼峰）：</p>
 * <ul>
 *     <li>userName → userName</li>
 *     <li>userID → userId</li>
 *     <li>HTTPResponseCode → httpResponseCode</li>
 *     <li>apiEndpointUrl → apiEndpointUrl</li>
 * </ul>
 *
 * @author linwumingshi
 * @version 1.0.0
 * @see com.fasterxml.jackson.databind.annotation.JsonNaming
 * @see com.fasterxml.jackson.databind.PropertyNamingStrategy
 * @since 2025-08-16
 */
@SuppressWarnings("all")
@EqualsAndHashCode(callSuper = true)
@Data
@JsonNaming
public class DefaultNamingModel extends BaseJsonNamingModel implements Serializable {

    /**
     * 额外测试字段 - 验证默认策略
     * <p>确保即使有@JsonNaming注解，仍使用小驼峰</p>
     */
    private String additionalField;

    /**
     * 复杂缩写字段 - 验证ID处理
     * <p>测试userID在默认策略下的转换</p>
     */
    private String orderItemID;
}