package com.power.doc.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.power.doc.enums.Sex;
import lombok.Data;

import java.math.BigDecimal;
import java.time.*;
import java.util.Calendar;
import java.util.Date;

/**
 * `@JsonFormat` 示例实体类 Example。
 */
@Data
public class JsonFormatExample {

    /**
     * "bigDecimalString":"8.19"
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "#.##")
    private BigDecimal bigDecimalString;

    /**
     * "bigDecimalNumber":8.09
     */
    @JsonFormat(pattern = "#.##")
    private BigDecimal bigDecimalNumber;

    /**
     * "floatString":"7.24"
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "#.##")
    private Float floatString;

    /**
     * "floatNumber":3.14159
     */
    @JsonFormat(pattern = "#.#####")
    private Float floatNumber;

    /**
     * "doubleString":"2.33"
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "#.##")
    private Double doubleString;

    /**
     * "doubleNumber":2.222
     */
    @JsonFormat(pattern = "#.###")
    private Double doubleNumber;

    /**
     * "longString": "123"
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "#.##")
    private Long longString;

    /**
     * "longNumber": 123
     */
    @JsonFormat(pattern = "#.###")
    private Long longNumber;

    /**
     *  "integerString": "1"
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "#.##")
    private Integer integerString;

    /**
     * "integerNumber": 1
     */
    @JsonFormat(pattern = "#.###")
    private Integer integerNumber;


    /**
     * "dateString": "2024-06-29 05:26:35"
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date dateString;

    /**
     * "dateStringNoPattern": "2024-06-29T04:55:13.479+00:00"
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Date dateStringNoPattern;

    /**
     * "dateNumber": 1719635517572
     */
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Date dateNumber;

    /**
     * "instantString": "2024-06-30 14:28:55"
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Instant instantString;

    /**
     * "instantStringNoPattern": "2024-06-29T04:55:13.479933600Z"
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Instant instantStringNoPattern;

    /**
     * "instantNumber": 1719635517.572653500
     */
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Instant instantNumber;

    /**
     * "zonedDateTimeString": "2024-06-29T12:31:57.572+0800"
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone = "GMT+8")
    private ZonedDateTime zonedDateTimeString;

    /**
     * "zonedDateTimeStringNoPattern": "2024-06-29T12:55:13.4799336+08:00"
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private ZonedDateTime zonedDateTimeStringNoPattern;


    /**
     * "zonedDateTimeNumber": 1719635517.572653500
     */
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private ZonedDateTime zonedDateTimeNumber;

    /**
     * "localDateTimeString": "2024-06-29 12:31:57"
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime localDateTimeString;


    /**
     * "localDateTimeStringNoPattern": "2024-06-29T12:55:13.4799336",
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDateTime localDateTimeStringNoPattern;

    /**
     * "localDateTimeNumber": [
     * 2024,
     * 6,
     * 29,
     * 21,
     * 39,
     * 55,
     * 694323000
     * ]
     */
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private LocalDateTime localDateTimeNumber;

    /**
     * "localDateString": "2024-06-29"
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate localDateString;

    /**
     * "localDateStringNoPattern": "2024-06-29"
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDate localDateStringNoPattern;

    /**
     * "localDateNumber":  [
     * 2024,
     * 6,
     * 27
     * ]
     */
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private LocalDate localDateNumber;


    /**
     * "localTimeString": "12:31:57"
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss")
    private LocalTime localTimeString;


    /**
     * "localTimeStringNoPattern": "12:55:13.4799336"
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalTime localTimeStringNoPattern;


    /**
     * "localTimeNumber": [
     * 12,
     * 31,
     * 57,
     * 572653500
     * ]
     */
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private LocalTime localTimeNumber;


    /**
     * "offsetDateTimeString": "2024-06-30T14:28:55+08:00"
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private OffsetDateTime offsetDateTimeString;

    /**
     * "offsetDateTimeStringNoPattern": "2024-06-30T14:28:55.7346858+08:00"
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private OffsetDateTime offsetDateTimeStringNoPattern;

    /**
     * "offsetDateTimeNumber": 1719635517.572653500
     */
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private OffsetDateTime offsetDateTimeNumber;

    /**
     * "calendarString": "2024-06-29 04:31:57"
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Calendar calendarString;


    /**
     * "calendarStringNoPattern": "2024-06-29T04:55:13.479+00:00"
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Calendar calendarStringNoPattern;

    /**
     * "calendarNumber": 1719635517572,
     */
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Calendar calendarNumber;

    /**
     * "yearString": "2024",
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yy")
    private Year yearString;

    /**
     * "yearStringNoPattern": "2024",
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Year yearStringNoPattern;

    /**
     * "yearNumber": 2024,
     */
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Year yearNumber;

    /**
     * "yearMonthString": "2024-06",
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM")
    private YearMonth yearMonthString;

    /**
     * "yearMonthStringNoPattern": "2024-06",
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private YearMonth yearMonthStringNoPattern;


    /**
     * "yearMonthNumber": [
     * 2024,
     * 6
     * ]
     */
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private YearMonth yearMonthNumber;


    /**
     * enum "dayOfWeekString": "SATURDAY"
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "EEEE")
    private DayOfWeek dayOfWeekString;
    /**
     * enum "dayOfWeekStringNoPattern": "SATURDAY"
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private DayOfWeek dayOfWeekStringNoPattern;

    /**
     * enum "dayOfWeekNumber": 5
     */
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private DayOfWeek dayOfWeekNumber;


    /**
     * "monthDayStringNoPattern": "--06-29",
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private MonthDay monthDayStringNoPattern;

    /**
     * "monthDayString": "06-29",
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd")
    private MonthDay monthDayString;

    /**
     * "monthDayNumber": [
     * 6,
     * 29
     * ]
     */
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private MonthDay monthDayNumber;

    /**
     * enum "monthString": "JUNE",
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM")
    private Month monthString;


    /**
     * enum "monthStringNoPattern": "JUNE",
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Month monthStringNoPattern;

    /**
     * enum "monthNumber": 5,
     */
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Month monthNumber;

    /**
     * "zoneOffsetString": "+08:00",
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "XXX")
    private ZoneOffset zoneOffsetString;

    /**
     * "zoneOffsetStringNoPattern": "+08:00"
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private ZoneOffset zoneOffsetStringNoPattern;


    /**
     * "zoneOffsetNumber": "+08:00"
     */
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private ZoneOffset zoneOffsetNumber;

    /**
     * "offsetTimeString": "14:28:55.734685+08:00",
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss.SSSSSSXXX")
    private OffsetTime offsetTimeString;

    /**
     * "offsetTimeStringNoPattern": "20:10:37.334190400+08:00"
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private OffsetTime offsetTimeStringNoPattern;

    /**
     * "offsetTimeNumber": [
     * 20,
     * 10,
     * 37,
     * 334190400,
     * "+08:00"
     * ]
     */
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private OffsetTime offsetTimeNumber;

    /**
     * "sexEnumNumber": 1
     */
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Sex sexEnumNumber;


    /**
     * "sexEnumNumberAndToString": "FEMALE"
     */
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    @JsonSerialize(using = ToStringSerializer.class)
    private Sex sexEnumNumberAndToString;
}




