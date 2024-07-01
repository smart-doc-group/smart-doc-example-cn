package com.power.doc.controller;

import com.power.common.model.CommonResult;
import com.power.doc.entity.JsonFormatExample;
import com.power.doc.enums.Sex;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.*;
import java.util.*;

/**
 *  JsonFormat  Annotation Controller
 *
 * @author linwumingshi
 * @see <a href="https://github.com/TongchengOpenSource/smart-doc/issues/828">issues #828</a>
 * @see <a href="https://github.com/TongchengOpenSource/smart-doc/issues/832">issues #832</a>
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/jsonFormat")
public class JsonFormatController {

    /**
     * 测试 response
     *
     * @return CommonResult
     */
    @GetMapping("/response")
    public CommonResult<JsonFormatExample> test() throws Exception {
        JsonFormatExample jsonFormatExample = new JsonFormatExample();

        // 设置  price 字段
        jsonFormatExample.setBigDecimalString(new BigDecimal("123.45"));
        jsonFormatExample.setBigDecimalNumber(new BigDecimal("123.45"));

        jsonFormatExample.setFloatString(123.45f);
        jsonFormatExample.setFloatNumber(123.45f);

        jsonFormatExample.setDoubleString(123.45d);
        jsonFormatExample.setDoubleNumber(123.45d);

        jsonFormatExample.setLongString(123L);
        jsonFormatExample.setLongNumber(123L);

        jsonFormatExample.setIntegerNumber(1);
        jsonFormatExample.setIntegerString(1);


        jsonFormatExample.setDateNumber(new Date());
        jsonFormatExample.setDateString(new Date());
        jsonFormatExample.setDateStringNoPattern(new Date());


        jsonFormatExample.setInstantString(Instant.now());
        jsonFormatExample.setInstantNumber(Instant.now());
        jsonFormatExample.setInstantStringNoPattern(Instant.now());

        jsonFormatExample.setZonedDateTimeNumber(ZonedDateTime.now());
        jsonFormatExample.setZonedDateTimeString(ZonedDateTime.now());
        jsonFormatExample.setZonedDateTimeStringNoPattern(ZonedDateTime.now());


        jsonFormatExample.setLocalDateTimeString(LocalDateTime.now());
        jsonFormatExample.setLocalDateTimeNumber(LocalDateTime.now());
        jsonFormatExample.setLocalDateTimeStringNoPattern(LocalDateTime.now());

        jsonFormatExample.setLocalDateString(LocalDate.now());
        jsonFormatExample.setLocalDateNumber(LocalDate.now());
        jsonFormatExample.setLocalDateStringNoPattern(LocalDate.now());


        jsonFormatExample.setLocalTimeString(LocalTime.now());
        jsonFormatExample.setLocalTimeNumber(LocalTime.now());
        jsonFormatExample.setLocalTimeStringNoPattern(LocalTime.now());

        jsonFormatExample.setOffsetDateTimeString(OffsetDateTime.now());
        jsonFormatExample.setOffsetDateTimeNumber(OffsetDateTime.now());
        jsonFormatExample.setOffsetDateTimeStringNoPattern(OffsetDateTime.now());

        jsonFormatExample.setCalendarString(Calendar.getInstance());
        jsonFormatExample.setCalendarNumber(Calendar.getInstance());
        jsonFormatExample.setCalendarStringNoPattern(Calendar.getInstance());

        jsonFormatExample.setYearString(Year.now());
        jsonFormatExample.setYearStringNoPattern(Year.now());
        jsonFormatExample.setYearNumber(Year.now());


        jsonFormatExample.setYearMonthString(YearMonth.now());
        jsonFormatExample.setYearMonthStringNoPattern(YearMonth.now());
        jsonFormatExample.setYearMonthNumber(YearMonth.now());

        jsonFormatExample.setDayOfWeekString(LocalDate.now().getDayOfWeek());
        jsonFormatExample.setDayOfWeekStringNoPattern(LocalDate.now().getDayOfWeek());
        jsonFormatExample.setDayOfWeekNumber(LocalDate.now().getDayOfWeek());


        jsonFormatExample.setMonthDayStringNoPattern(MonthDay.now());
        jsonFormatExample.setMonthDayNumber(MonthDay.now());
        jsonFormatExample.setMonthDayString(MonthDay.now());

        jsonFormatExample.setMonthString(LocalDate.now().getMonth());
        jsonFormatExample.setMonthStringNoPattern(LocalDate.now().getMonth());
        jsonFormatExample.setMonthNumber(LocalDate.now().getMonth());

        jsonFormatExample.setZoneOffsetString(ZoneOffset.of("+08:00"));
        jsonFormatExample.setZoneOffsetStringNoPattern(ZoneOffset.of("+08:00"));
        jsonFormatExample.setZoneOffsetNumber(ZoneOffset.of("+08:00"));


        jsonFormatExample.setOffsetTimeString(OffsetTime.now());
        jsonFormatExample.setOffsetTimeStringNoPattern(OffsetTime.now());
        jsonFormatExample.setOffsetTimeNumber(OffsetTime.now());

        jsonFormatExample.setSexEnumNumber(Sex.FEMALE);
        jsonFormatExample.setSexEnumNumberAndToString(Sex.FEMALE);

        return CommonResult.ok().setResult(jsonFormatExample);

    }


    /**
     * 测试 request 和 response
     *
     * @param example example
     * @return CommonResult
     */
    @PostMapping("/request/response")
    public CommonResult<JsonFormatExample> test(@RequestBody JsonFormatExample example) throws Exception {
        return CommonResult.ok().setResult(example);
    }
}
