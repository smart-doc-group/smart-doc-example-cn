package com.power.doc.controller.json;


import com.power.common.model.CommonResult;
import com.power.doc.model.JsonNamingAnnotation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * JsonNaming Controller
 *
 * @author linuwmingshi
 * @version 1.0.0
 * @since 2025-08-16  16:23:06
 */
@RestController
@RequestMapping("/test/jsonNaming")
public class JsonNamingController {


    /**
     * JsonNaming
     *
     * @param body JsonNamingAnnotation
     * @return JsonNamingAnnotation
     */
    @PostMapping("/testOne")
    public CommonResult<JsonNamingAnnotation> testOne(@RequestBody JsonNamingAnnotation body) {
        return CommonResult.ok(body);
    }
}
