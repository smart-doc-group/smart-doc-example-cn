package com.power.doc.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author yu 2018/12/11.
 */
public class DateEntity extends SuperDataEntity {

    /**
     * 创建日期
     * @since v1.0
     */
    private LocalDate localDate;

    /**
     * 创建时间
     * @since v1.0
     */
    private LocalDateTime localDateTime;

    /**
     * jdk8 LocalTime
     */
    private LocalTime localTime;
}
