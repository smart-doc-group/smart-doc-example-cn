package com.power.doc.model;


import com.power.doc.model.json.naming.DefaultNamingModel;
import com.power.doc.model.json.naming.KebabCaseModel;
import com.power.doc.model.json.naming.LowerCamelCaseModel;
import com.power.doc.model.json.naming.LowerCaseModel;
import com.power.doc.model.json.naming.LowerDotCaseModel;
import com.power.doc.model.json.naming.SnakeCaseModel;
import com.power.doc.model.json.naming.UpperCamelCaseModel;
import com.power.doc.model.json.naming.UpperSnakeCaseModel;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * JsonNaming Annotation Model
 *
 * @author linwumingshi
 * @version 1.0.0
 * @since 2025-08-16  15:51:32
 */
@Data
public class JsonNamingAnnotation implements Serializable {

    /**
     * serialVersionUID
     */
    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 默认命名策略测试模型
     */
    private DefaultNamingModel defaultNamingModel;

    /**
     * 短横线命名策略测试模型
     */
    private KebabCaseModel kebabCaseModel;

    /**
     * 小驼峰命名策略测试模型
     */
    private LowerCamelCaseModel lowerCamelCaseModel;

    /**
     * 全小写命名策略测试模型
     */
    private LowerCaseModel lowerCaseModel;

    /**
     * 点分命名策略测试模型
     */
    private LowerDotCaseModel lowerDotCaseModel;

    /**
     * 蛇形命名策略测试模型(小写字母加下划线命名)
     */
    private SnakeCaseModel snakeCaseModel;

    /**
     * 大驼峰命名策略测试模型
     */
    private UpperCamelCaseModel upperCamelCaseModel;

    /**
     * 大写蛇形命名策略测试模型(大写字母加下划线命名)
     */
    private UpperSnakeCaseModel upperSnakeCaseModel;

}
