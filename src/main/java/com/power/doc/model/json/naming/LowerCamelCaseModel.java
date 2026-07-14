package com.power.doc.model.json.naming;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.power.doc.model.json.naming.base.BaseJsonNamingModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 小驼峰命名策略测试模型。
 *
 * <p>使用Jackson的LOWER_CAMEL_CASE命名策略，该策略是Java默认命名方式，
 * 不会对字段名进行任何转换。适用于标准JavaBean命名场景。</p>
 *
 * <p>字段转换示例：
 * <ul>
 *     <li>userName → userName</li>
 *     <li>userID → userId</li>
 *     <li>HTTPResponseCode → httpResponseCode</li>
 * </ul>
 * </p>
 *
 * @author linwumingshi
 * @version 1.0.0
 * @since 2025-08-16
 */
@EqualsAndHashCode(callSuper = true)
@Data
@JsonNaming(PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public class LowerCamelCaseModel extends BaseJsonNamingModel implements Serializable {

}