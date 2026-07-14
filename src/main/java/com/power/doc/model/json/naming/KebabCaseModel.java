package com.power.doc.model.json.naming;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.power.doc.model.json.naming.base.BaseJsonNamingModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 短横线命名策略测试模型。
 *
 * <p>使用Jackson的KEBAB_CASE命名策略，将字段名转换为小写字母加短横线的形式。
 * 常用于URL路径参数或前端框架属性命名。</p>
 *
 * <p>字段转换示例：
 * <ul>
 *     <li>userName → user-name</li>
 *     <li>userID → user-id</li>
 *     <li>HTTPResponseCode → http-response-code</li>
 * </ul>
 * </p>
 *
 * @author linwumingshi
 * @version 1.0.0
 * @since 2025-08-16
 */
@EqualsAndHashCode(callSuper = true)
@Data
@JsonNaming
public class KebabCaseModel extends BaseJsonNamingModel implements Serializable {

}