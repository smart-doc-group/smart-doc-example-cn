package com.power.doc.entity;

import com.power.common.enums.HttpCodeEnum;
import lombok.Builder;
import lombok.Data;

import java.util.Set;


@Data
@Builder
public class PermissionSet {

    /**
     * 来自common-util的枚举
     */
    private HttpCodeEnum codeEnum;

    private int id;

    /**
     * 权限，jdk 17关键字
     */
    private Set<Permit> permits;


}
