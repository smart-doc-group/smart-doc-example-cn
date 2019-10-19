package com.power.doc.controller;

import com.power.doc.model.OuterClass;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Test inner class
 * @author yu 2019/10/19.
 */
@RestController
public class InnerClassController {

    /**
     * Return A object contains Inner class
     * @return
     */
    @GetMapping("/inner/class")
    public OuterClass outerClassTest() {
        return null;
    }
}
