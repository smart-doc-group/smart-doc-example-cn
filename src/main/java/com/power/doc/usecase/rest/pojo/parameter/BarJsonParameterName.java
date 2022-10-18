package com.power.doc.usecase.rest.pojo.parameter;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import lombok.Data;

/**
 * 被忽略的com.fasterxml.jackson.annotation注解
 * @author zongzi
 */
@JsonIgnoreType
@Data
public class BarJsonParameterName {
	String barString;
}
