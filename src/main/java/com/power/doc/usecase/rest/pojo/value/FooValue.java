package com.power.doc.usecase.rest.pojo.value;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.power.doc.usecase.rest.pojo.type.BarType;
import lombok.Data;

/**
 * 测试示例值对象
 * @author zongzi
 */
@Data
public class FooValue {
	Boolean fooBooleanInBox;
	boolean fooBoolean;
	/**
	 * TODO #015 如果是包装的Char类型，显示的示例值为多位的字符串
	 */
	Character fooCharInBox;
	char fooChar;
	Double fooDoubleInBox;
	double fooDouble;
	Float fooFloatInBox;
	float fooFloat;
	Byte fooByteInBox;
	byte fooByte;
	Short fooShortInBox;
	short fooShort;
	Integer fooIntInBox;
	int fooInt;
	Long fooLongInBox;
	long fooLong;
	String fooString;
	BigDecimal fooBigDecimal;
	Date foolDate;
	boolean[] fooBooleanArray;
	char[] fooCharArray;
	float[] fooFloatArray;
	double[] fooDoubleArray;
	byte[] fooByteArray;
	short[] fooShortArray;
	int[] fooIntArray;
	BarType bar;
	BarType[] fooBarArray;
	Long[] fooLongArray;
	String[] fooStringArray;
	List<String> fooStringList;
	List<BarType> fooBarList;
	Map<String, Integer> foolStringIntegerMap;
	Map<String, BarType> foolStringBarMap;
	FooEnum fooEnum;
	List<FooEnum> fooEnums;
	Map<FooEnum, FooEnum> fooEnumMap;

}

enum FooEnum {
	/**
	 * 示例枚举
	 */
	BAR_A(1, "2"), BAR_B(1, "3"), BAR_C(2, "1");

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
