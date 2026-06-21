package com.power.doc.model;

import tools.jackson.databind.annotation.JsonSerialize;
import tools.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

@Data
public class SerializerTestModel {

    /**
     * 自动将前端String转换成Long
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;
}
