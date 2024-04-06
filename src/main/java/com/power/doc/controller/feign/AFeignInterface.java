package com.power.doc.controller.feign;

import com.power.doc.constants.AuthConst;
import com.power.doc.constants.RequestHeadValue;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * feign测试
 * @restApi
 * @author yu 2020/6/21.
 */
@FeignClient(value = "SER0",path = RequestHeadValue.PREFIX + RequestHeadValue.URL + "/" + AFeignInterface.PREFIX)
public interface AFeignInterface {

    String PREFIX = "BFeignInterface";

    /**
     * 解析路径
     * @param id 标识
     * @param name 姓名
     * @return un
     */
    @GetMapping(value = "/{id}/{name}")
    String pathResolve(@PathVariable String id,@PathVariable String name);

    /*@RequestMapping("/testRequestParam")
    String testRequestParam(@RequestMapping(value = "") String name)*/

    /**
     * 接口中的注解
     * @return
     */
    @RequestMapping(AuthConst.OAuthScope.USERINFO)
    String issue216();

    /**
     * 模具
     * @return
     */
    @GetMapping(value = "/feign/test")
    String test();
}
