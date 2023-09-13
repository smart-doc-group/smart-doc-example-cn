package com.power.doc.usecase.rest.pojo.type;

/**
 * 测试枚举对象
 * @author zongzi
 */
public enum FooEnum {
	/**
	 * 示例枚举
	 */
	FOO_A(1, "2"), FOO_B(1, "3"), FOO_C(2, "1");

	private int fooInt;
	private String fooString;

	FooEnum(int i, String j) {
		this.fooInt = i;
		this.fooString = j;
	}

	public int getFooInt() {
		return fooInt;
	}

	public void setFooInt(int fooInt) {
		this.fooInt = fooInt;
	}

	public String getFooString() {
		return fooString;
	}

	public void setFooString(String fooString) {
		this.fooString = fooString;
	}
}
