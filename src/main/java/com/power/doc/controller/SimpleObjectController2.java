package com.power.doc.controller;

import com.power.common.model.CommonResult;
import com.power.doc.model.Children;
import com.power.doc.model.Staff;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 简单对象测试2
 *
 * @author yu 2018/06/30.
 */

@RestController
public class SimpleObjectController2 {

    /**
     * CommonResult&lt;String&gt;
     *
     * @return
     */
    @PostMapping(value = "/stringCommonResult")
    public CommonResult<String> stringCommonResult() {
        return null;
    }

    /**
     * 返回Staff&lt;Staff&lt;Staff&gt;&gt;
     *
     * @return
     */
    @PostMapping("/staff")
    public Staff<Staff<Staff>> testStaff() {
        return null;
    }

    /**
     * 返回Staff&lt;String&gt;
     *
     * @return
     */
    @PostMapping(value = "/staffStr")
    public Staff<String> testStaffString() {
        return null;
    }

    /**
     * JAVA继承测试
     * @param children
     * @return
     */
    @PostMapping(value = "/children")
    public Children testChildren(@RequestBody Children children){
        return children;
    }
}
