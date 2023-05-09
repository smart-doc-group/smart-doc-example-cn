package com.power.doc.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Set;


@Data
@Builder
public class PermissionSet {

    private int id;

    /**
     * 权限，jdk 17关键字
     */
    private Set<Permit> permits;
}
