package com.power.doc.controller;

import com.power.doc.constants.ApiVersion;
import com.power.doc.constants.RequestParamConstant;
import com.power.doc.constants.RequestValueConstant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author boxer
 * @since 2020/6/19 9:55
 */
@RestController
public class ApiNoteController {

    /**
     * Test Constants
     *
     * @param page 页码
     */
    @GetMapping(value = "testConstants/" + ApiVersion.VERSION)
    public void testConstantsRequestParams(@RequestParam(required = false, defaultValue = RequestValueConstant.PAGE_DEFAULT_NONE, value = RequestParamConstant.PAGE) int page) {

    }
}
