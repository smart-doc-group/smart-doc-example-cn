package com.power.doc.usecase.rpc.api.pojo.required;

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
public class RpcBarJsr303 {
	@NotNull
	String barNotNullString;

	@NotBlank
	String barNotBlankString;

	@NotEmpty
	String barNotEmptyString;

	@Null
	String barMustNullString;

	@AssertTrue
	Boolean barMustTureBool;

	@AssertFalse
	Boolean barMustFalseBool;

	@PositiveOrZero
	Integer barPositiveOrZeroInt;

	@Positive
	Integer barPositiveInt;

	@NegativeOrZero
	Integer barNegativeOrZeroInt;

	@Negative
	Integer barNegativeInt;


	@Min(10)
	int barMinInt;

	@Max(11)
	int barMaxInt;

	@DecimalMin("10")
	Long barMinDecimal;

	@DecimalMax("100")
	Long barMaxDecimal;


	@Size(min = 3, max = 4)
	String barSizeString;

	@Size(min = 3, max = 4)
	List<String> barSizeStringArray;

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

	@Pattern(regexp = ".*")
	String barPatternStringWithComment;

	@Pattern(regexp = ".*")
	String barPatternString;

	@Email(regexp = ".*")
	String barEmailString;
}
