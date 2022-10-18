package com.power.doc.usecase.rest.pojo.type;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.power.doc.usecase.rest.api.query.parameter.QueryParameterValueUseCase;
import lombok.Data;

/**
 * 测试对象类型
 * @author zongzi
 */
@Data
public class FooType {
	Boolean fooBooleanInBox;
	boolean fooBoolean;
	Character fooCharInBox;
	char fooChar;
	Double fooDoubleInBox;
	double foolDouble;
	Float fooFloatInBox;
	float fooFloat;
	/**
	 * TODO #005 如果这里使用的包装类型Byte类型, 显示的Type类型为Object,
	 */
	Byte fooByteInBox;
	byte fooByte;
	Short fooShortInBox;
	short foolShort;
	Integer fooIntInBox;
	int foolInt;
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
	BarType[] fooBarArray;
	Long[] fooLongArray;
	String[] fooStringArray;
	List<String> fooStringList;
	BarType bar;
	/**
	 * TODO #011 类型List&lt;Bar&gt;，示例值体现不出这是个Bar对象，
	 * 查看{@link QueryParameterValueUseCase}获取更多示例
	 */
	List<BarType> fooBarList;
	/**
	 * TODO #012 类型List&lt;String,Integer&gt; 没有示例值，
	 * 查看{@link QueryParameterValueUseCase}获取更多示例
	 */
	Map<String, Integer> foolStringIntegerMap;

	/**
	 * TODO #013 类型Map&lt;String,Bar&gt; 示例值体现不出这个Map中是String和Bar对象，
	 * 查看{@link QueryParameterValueUseCase}获取更多示例
	 */
	Map<String, BarType> foolStringBarMap;

	FooEnum fooEnum;
	List<FooEnum> fooEnums;
	/**
	 * TODO ?001 生成的Type字段中，是否需要指定Value的类型？
	 */
	Map<FooEnum, FooEnum> fooEnumMap;
}

