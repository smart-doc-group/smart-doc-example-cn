package com.power.doc.model.json.naming;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.power.doc.model.json.naming.base.BaseJsonNamingModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 点分命名策略测试模型。
 *
 * <p>使用Jackson的LOWER_DOT_CASE命名策略，将字段名转换为小写字母加点号的形式。
 * 常用于配置文件属性命名，如Spring Boot的application.properties。</p>
 *
 * <p>字段转换示例：
 * <ul>
 *     <li>userName → user.name</li>
 *     <li>userID → user.id</li>
 *     <li>HTTPResponseCode → http.response.code</li>
 * </ul>
 * </p>
 *
 * @author linwumingshi
 * @version 1.0.0
 * @since 2025-08-16
 */
@EqualsAndHashCode(callSuper = true)
@Data
@JsonNaming(PropertyNamingStrategies.LowerDotCaseStrategy.class)
public class LowerDotCaseModel extends BaseJsonNamingModel implements Serializable {

}