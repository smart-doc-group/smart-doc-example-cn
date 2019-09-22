package com.power.doc.controller;

import com.power.doc.entity.DateEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * JDK8的时间测试
 * @author yu 2019/9/22.
 */
@RestController
public class JDk8TimeController {
    /**
     * LocalDate和LocalDateTime测试
     * @param dateEntity
     * @return
     */
    @PostMapping("dateEntity")
    public DateEntity testDate(@RequestBody DateEntity dateEntity){

        return null;
    }
}
