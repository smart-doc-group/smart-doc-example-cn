package com.power.doc.model;

import lombok.Data;

/**
 * @author yu 2022/8/20.
 */
@Data
public class EnumUse {
    private int id;

    /**
     * @see com.power.doc.enums.Sexe
     */
    private String sex;
}
