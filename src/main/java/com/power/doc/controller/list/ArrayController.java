package com.power.doc.controller.list;

import com.power.common.model.CommonResult;
import com.power.doc.entity.SimpleUser;
import com.power.doc.model.Subject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 测试Array
 */
@RestController
public class ArrayController {

    /**
     * Array test
     * @return
     */
    @PostMapping("arr")
    public CommonResult<Subject[]> testArray() {
        return CommonResult.ok();
    }

    /**
     * Array test1
     * @return
     */
    @PostMapping("arr1")
    public CommonResult<List<Subject>> testArray1() {
        return CommonResult.ok();
    }

}
