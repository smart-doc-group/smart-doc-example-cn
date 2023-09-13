package com.power.doc.usecase.rpc.api.pojo.since;

import lombok.Data;

@Data
public class RpcFooSince {
	/**
	 * 从1.0.0版本开始
	 * @since 1.0.0
	 */
	String fooStr;
	/**
	 * 从1.0.1版本开始
	 * @since 1.0.1
	 */
	Integer fooInt;
	/**
	 * 从1.0.2,1.0.3版本开始
	 * @since 1.0.2
	 * @since 1.0.3
	 */
	Enum fooEnum;

	/**
	 * 从<a href="https://smart-doc-group.github.io/#/zh-cn/start/quickstart">2.5.3</a>版本开始
	 * @since <a href="https://smart-doc-group.github.io/#/zh-cn/start/quickstart">2.5.3</a>
	 */
	Double fooDouble;

	/**
	 * 从@#$%^&*(!!!版本开始
	 * @since @#$%^&*(!!!
	 */
	Long fooLong;
}
