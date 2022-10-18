package com.power.doc.usecase.rest.pojo.result;

import com.power.doc.usecase.rest.pojo.type.FooEnum;
import lombok.Data;

/**
 * 多泛型的返回对象
 * @author zongzi
 * @param <K>
 * @param <V>
 */
@Data
public class BarResult<K,V>{


	FooEnum code;
	String message;
	K fooData;
	V barData;
	String traceId;
}
