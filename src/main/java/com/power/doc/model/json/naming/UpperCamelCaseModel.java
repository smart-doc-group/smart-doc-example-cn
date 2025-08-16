package com.power.doc.model.json.naming;


import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.power.doc.model.json.naming.base.BaseJsonNamingModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 大驼峰命名策略测试模型。
 *
 * <p>使用Jackson的UPPER_CAMEL_CASE命名策略，将字段名转换为首字母大写的
 * 驼峰形式。适用于需要PascalCase命名的JSON场景。</p>
 *
 * <p>字段转换示例：
 * <ul>
 *     <li>userName → UserName</li>
 *     <li>userID → UserId</li>
 *     <li>HTTPResponseCode → HttpResponseCode</li>
 * </ul>
 * </p>
 *
 * @author linwumingshi
 * @version 1.0.0
 * @since 2025-08-16
 */
@EqualsAndHashCode(callSuper = true)
@Data
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class UpperCamelCaseModel extends BaseJsonNamingModel implements Serializable {

}