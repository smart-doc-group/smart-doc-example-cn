package com.power.doc.usecase.rest.pojo.required;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Negative;
import javax.validation.constraints.NegativeOrZero;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Past;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 * 测试JSR-303标准注解
 * @author zongzi
 */
@Data
public class BarJsr303 {
	/**
	 * 使用@NotNull规定必须不为空
	 */
	@NotNull
	String barNotNullString;

	@NotBlank
	String barNotBlankString;

	@NotEmpty
	String barNotEmptyString;

	/**
	 * #019-1 示例值应为空，此处正常生成了示例值
	 */
	@Null
	String barMustNullString;

	@AssertTrue
	Boolean barMustTureBool;

	/**
	 * #019-2 示例值应为False，此处生成的示例值为True
	 */
	@AssertFalse
	Boolean barMustFalseBool;

	@PositiveOrZero
	Integer barPositiveOrZeroInt;

	@Positive
	Integer barPositiveInt;

	/**
	 * #019-3 示例值为正数
	 */
	@NegativeOrZero
	Integer barNegativeOrZeroInt;

	/**
	 * #019-4 示例值为正数
	 */
	@Negative
	Integer barNegativeInt;


	@Min(10)
	int barMinInt;

	/**
	 * #019-5 最大值为11，示例值大于11
	 */
	@Max(11)
	int barMaxInt;

	@DecimalMin("10")
	Long barMinDecimal;

	/**
	 * #019-6 最大值为100
	 */
	@DecimalMax("100")
	Long barMaxDecimal;


	/**
	 * #019-7-0 Size[3,4]
	 * #019-7-1 对于@Size注解，自动生成的Validate[],只声明了Max，没有声明Min
	 */
	@Size(min = 3, max = 4)
	String barSizeString;

	/**
	 * #019-8 Size[3,4]
	 */
	@Size(min = 3, max = 4)
	List<String> barSizeStringArray;

	/**
	 * #019-8 Digits(100.100)
	 */
	@Digits(integer = 100, fraction = 99)
	Double barDigitsDouble;

	@Past
	Date barPastDate;
	@PastOrPresent
	Date barPastOrPresent;

	@Future
	Date barFutureDate;
	@FutureOrPresent
	Date barFutureOrPresentDate;

	/**
	 * #019-10 如果声明了注释，就会省略null，结合下面的字段一起查看
	 */
	@Pattern(regexp = ".*")
	String barPatternStringWithComment;

	@Pattern(regexp = ".*")
	String barPatternString;

	/**
	 * #019-11 可以使用类似Xeger的库生成符合对应正则的实例字符串
	 */
	@Email(regexp = ".*")
	String barEmailString;
}
