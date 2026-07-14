package com.power.doc.model.json.naming;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.power.doc.model.json.naming.base.BaseJsonNamingModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 大写蛇形命名策略测试模型。
 *
 * <p>使用Jackson的UPPER_SNAKE_CASE命名策略，将字段名转换为大写字母加下划线的形式。
 * 常用于常量命名或需要强调的配置项。</p>
 *
 * <p>字段转换示例：
 * <ul>
 *     <li>userName → USER_NAME</li>
 *     <li>userID → USER_ID</li>
 *     <li>HTTPResponseCode → HTTP_RESPONSE_CODE</li>
 * </ul>
 * </p>
 *
 * @author linwumingshi
 * @version 1.0.0
 * @since 2025-08-16
 */
@EqualsAndHashCode(callSuper = true)
@Data
@JsonNaming(PropertyNamingStrategies.UpperSnakeCaseStrategy.class)
public class UpperSnakeCaseModel extends BaseJsonNamingModel implements Serializable {

}