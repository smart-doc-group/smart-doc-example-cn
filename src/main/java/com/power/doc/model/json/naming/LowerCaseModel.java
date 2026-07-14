package com.power.doc.model.json.naming;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.power.doc.model.json.naming.base.BaseJsonNamingModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 全小写命名策略测试模型。
 *
 * <p>使用Jackson的LOWER_CASE命名策略，将字段名转换为全小写字母形式，
 * 不使用任何分隔符。适用于简单字段名的场景。</p>
 *
 * <p>字段转换示例：
 * <ul>
 *     <li>userName → username</li>
 *     <li>userID → userid</li>
 *     <li>HTTPResponseCode → httpresponsecode</li>
 * </ul>
 * </p>
 *
 * @author linwumingshi
 * @version 1.0.0
 * @since 2025-08-16
 */
@EqualsAndHashCode(callSuper = true)
@Data
@JsonNaming(PropertyNamingStrategies.LowerCaseStrategy.class)
public class LowerCaseModel extends BaseJsonNamingModel implements Serializable {

}