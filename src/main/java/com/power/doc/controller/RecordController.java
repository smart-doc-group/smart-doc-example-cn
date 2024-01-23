package com.power.doc.controller;


import com.power.doc.model.records.Rectangle;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Record测试
 */
@RestController
public class RecordController {


    /**
     * 测试Record
     * @param rectangle
     */
    @PostMapping("/recordTest")
    public void recordTest(@RequestBody Rectangle rectangle) {

    }
}
