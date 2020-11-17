package com.power.doc.controller;

import com.power.doc.model.FastJson;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试json
 * @author yu 2020/11/17.
 */
@RestController
public class JsonController {

    /**
     * RequestParam+json
     * @param name
     * @param pramInfo
     * @return
     */
    @PostMapping(value = "/getUserJson")
    public String getUserJson(@RequestParam String name, @RequestBody FastJson pramInfo) {
        return null;
    }
}
