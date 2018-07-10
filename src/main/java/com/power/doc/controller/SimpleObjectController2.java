package com.power.doc.controller;

import com.power.common.model.CommonResult;
import com.power.doc.model.Children;
import com.power.doc.model.Staff;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * 简单对象测试2
 *
 * @author yu 2018/06/30.
 */

@RestController
public class SimpleObjectController2 {

    /**
     * 泛型基础对象
     *
     * @return
     */
    @PostMapping(value = "/stringCommonResult")
    public CommonResult<String> stringCommonResult() {
        return null;
    }

    /**
     * Staff<Staff<Staff>>
     *
     * @return
     */
    @PostMapping("/staff")
    public Staff<Staff<Staff>> testStaff() {
        return null;
    }

    /**
     * Staff String
     *
     * @return
     */
    @PostMapping(value = "/staffStr")
    public Staff<String> testStaffString() {
        return null;
    }

    /**
     * 继承测试
     * @return
     */
    @PostMapping(value = "/children")
    public Children testChildren(){
        return null;
    }
}
