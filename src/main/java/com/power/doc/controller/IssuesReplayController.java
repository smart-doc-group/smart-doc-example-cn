package com.power.doc.controller;

import com.power.common.model.CommonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 问题复现
 *
 * @author 曾祥权
 * @description TODO
 * @CreateTime 2022/2/14 20:30
 */
@RestController("/issues")
public class IssuesReplayController {
    /**
     * 提供案例
     * https://github.com/smart-doc-group/smart-doc/issues/190
     *
     * @param telephone
     * @param password
     * @return
     * @see {@link "https://github.com/smart-doc-group/smart-doc/issues/190"}
     */
    @PostMapping("/login")
    public CommonResult login(@telephone String telephone,
                              @check(value = "密码", min = 32, max = 32) String password,@RequestBody Userx userx) {
        return CommonResult.ok();
    }
}

class Userx{
    public Integer id;
}
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@interface telephone {

}

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@interface check {

    String value();

    int min();

    int max();


}
