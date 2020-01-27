package com.power.doc.entity.valid;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * @author yu 2020/1/27.
 */
public class Collect {

    /**
     * 主键id
     */
    @Null(groups = {SaveAction.class}, message = "id必须为空")
    @NotNull(groups = {UpdateAction.class}, message = "id不能为空")
    private Long id;

    /**
     * 名称
     */
    private String name;
}
