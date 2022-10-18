package com.power.doc.usecase.rpc.api.method.invoke;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.power.doc.usecase.rest.pojo.type.FooEnum;
import com.power.doc.usecase.rpc.api.pojo.description.FooDescription;
import org.beetl.ow2.asm.optimizer.Shrinker;

/**
 * RPC.Method.Invoke.Description Usecase
 * @author zongzi
 * @dubbo
 */
public interface DescriptionFieldUseCase {

	/**
	 * Basic Type Description
	 * @apiNote 测试基本对象的Description的渲染效果
	 * @param fooByte 测试参数描述
	 * @param fooShort 测试参数描述
	 * @param fooInt 测试参数描述
	 * @param fooLong 测试参数描述
	 * @param fooBool 测试参数描述
	 * @param fooChar 测试参数描述
	 * @param fooDouble 测试参数描述
	 * @param fooFloat 测试参数描述
	 * @param fooDate 测试参数描述
	 * @param fooBigDecimal 测试参数描述
	 * @param fooString 测试参数描述
	 * @param fooEnum 测试参数描述 TODO 0x0A Description中没有展示枚举对象的示例值
	 */

	void useBasicTypesBox(Byte fooByte, Short fooShort, Integer fooInt, Long fooLong, Boolean fooBool, Character fooChar, Double fooDouble, Float fooFloat,
			Date fooDate, BigDecimal fooBigDecimal, String fooString, FooEnum fooEnum);


	/**
	 * Use Arrays
	 * @apiNote 当使用数组时，Description中会展示<code>(children type: xxx)</code> <br>
	 * TODO 0x0B 枚举数组被直接忽略未渲染，使用...方式声明的参数可以正常渲染，但是没有展示(childre type:xxx)
	 * @param fooBytes 测试Byte数组
	 * @param fooShorts 测试Short数组
	 * @param fooInts 测试Integer数组
	 * @param fooLongs 测试Long数组
	 * @param fooEnums  测试枚举数组（注意，这个类型被直接忽略了未渲染）
	 * @param fooEnums2 使用...的方式声明的枚举数组
	 */
	void useArray(Byte[] fooBytes, Short[] fooShorts, Integer[] fooInts, Long[] fooLongs, FooEnum[] fooEnums, FooEnum... fooEnums2);

	/**
	 * Use Collections<List> & Collection<Set>
	 * @apiNote 当使用List/Set的形式作为入参时 Description中会展示<code>(children type: xxx)</code><br>
	 * <i>同样的也存在枚举类型无法渲染的问题</i>
	 * @param fooBytes 测试参数描述
	 * @param fooShorts 测试参数描述
	 * @param fooInts 测试参数描述
	 * @param fooLong 测试参数描述
	 * @param fooDate 测试参数描述
	 * @param fooString 测试参数描述
	 * @param fooEnumList 测试参数描述
	 * @param fooByteSet 测试参数描述
	 * @param fooShortSet 测试参数描述
	 * @param fooIntSet 测试参数描述
	 * @param fooLonSet 测试参数描述
	 * @param fooDatSet 测试参数描述
	 * @param fooStrSet 测试参数描述
	 * @param fooEnumSet 测试参数描述
	 */
	void useCollection(List<Byte> fooBytes, List<Short> fooShorts, List<Integer> fooInts, List<Long> fooLong, List<Date> fooDate, List<String> fooString,
			List<FooEnum> fooEnumList, Set<Byte> fooByteSet, Set<Short> fooShortSet, Set<Integer> fooIntSet, Set<Long> fooLonSet, Set<Date> fooDatSet, Set<String> fooStrSet,
			Set<FooEnum> fooEnumSet);

	/**
	 * When Use JSR-303 Annotations
	 * @apiNote 当使用JSR-303的注解时，Description字段会拼接此类注解的描述信息<code>Validate[]</code>中进行显示，
	 * TODO 0x0E 注意：如果使用JSR-303字段，但是不添加描述的话，缺省值不是 <code>No comments Founds </code>而是 <code>null</code>
	 * @param fooEmail 测试@email字段情况
	 * @param fooRegex 测试@Pattern字段情况
	 * @param fooSize  测试@Size字段情况
	 * @param fooEmailNoComment
	 */
	void useJsr303(@Email(regexp = ".*")String fooEmail,@Pattern(regexp = ".*")String fooRegex,@Size(max = 10,min = 1) String fooSize,
			@Email(regexp = ".*") String fooEmailNoComment);
	/**
	 * Use Html Code At Description Area
	 * @apiNote 可以在参数描述区域使用HTML标签
	 * @param fooStr <i>此处用来展示参数描述</i> <code>System.out.println("this is a code snippet");</code> <br>
	 *                  <a href="https://smart-doc-group.github.io/#/zh-cn/start/quickstart">smart-doc</a>
	 */
	void useHtmlCode(String fooStr);


	/**
	 * When Claim A Description At Class's Parameter Area
	 * @apiNote 在类的参数上的描述使用实例
	 * @param foo 测试对象
	 */
	void useSelfDefinition(FooDescription foo);
}

