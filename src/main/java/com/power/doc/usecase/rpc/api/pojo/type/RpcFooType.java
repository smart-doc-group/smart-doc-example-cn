package com.power.doc.usecase.rpc.api.pojo.type;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.power.doc.usecase.rest.pojo.type.BarType;
import com.power.doc.usecase.rest.pojo.type.FooEnum;
import lombok.Data;

/**
 * 测试RPC对象类型
 */
@Data
public class RpcFooType {
	Boolean fooBooleanInBox;
	boolean fooBoolean;
	Character fooCharInBox;
	char fooChar;
	Double fooDoubleInBox;
	double foolDouble;
	Float fooFloatInBox;
	float fooFloat;
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
	BarType bar;
	boolean[] fooBooleanArray;
	char[] fooCharArray;
	float[] fooFloatArray;
	double[] fooDoubleArray;
	byte[] fooByteArray;
	short[] fooShortArray;
	int[] fooIntArray;
	long[] fooLongArray;
	String[] fooStringArray;
	BarType[] fooBarArray;
	List<String> fooStringList;
	List<BarType> fooBarList;
	Map<String, Integer> foolStringIntegerMap;
	Map<String, BarType> foolStringBarMap;
	FooEnum fooEnum;
	FooEnum[] fooEnumArray;
	List<FooEnum> fooEnumList;
	Map<FooEnum, FooEnum> fooEnumMap;
}
