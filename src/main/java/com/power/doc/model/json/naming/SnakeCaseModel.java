package com.power.doc.model.json.naming;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.power.doc.model.json.naming.base.BaseJsonNamingModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 蛇形命名策略测试模型。
 *
 * <p>使用Jackson的SNAKE_CASE命名策略，将字段名转换为小写字母加下划线的形式。
 * 是JSON中最常用的命名风格之一，特别适合与Python等语言交互。</p>
 *
 * <p>字段转换示例：
 * <ul>
 *     <li>userName → user_name</li>
 *     <li>userID → user_id</li>
 *     <li>HTTPResponseCode → http_response_code</li>
 * </ul>
 * </p>
 *
 * @author linwumingshi
 * @version 1.0.0
 * @since 2025-08-16
 */
@EqualsAndHashCode(callSuper = true)
@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SnakeCaseModel extends BaseJsonNamingModel implements Serializable {

}