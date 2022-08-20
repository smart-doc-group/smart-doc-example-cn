package com.power.doc.controller;

import com.power.common.model.CommonResult;
import com.power.doc.entity.Pager;
import com.power.doc.entity.SimpleUser;
import com.power.doc.model.SubUser;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Stream;

/**
 * 注释tag
 * 用例
 * @author yu 2020/7/2.
 */
@RestController
@RequestMapping("tags")
public class TagsController {

    /**
     * 测试apiNote tag
     * @author cht
     * @apiNote
     * # This method returns a List instead of a Collection or Stream
     *
     * * because processing of multiple Wombats usually involves traversing
     *
     * * the list in alternating forward and reverse directions.
     * @return
     */
    @Deprecated
    @PostMapping(value = "/apiNote")
    public String test(List<String> user){
        return "hello apiNote";
    }

    /**
     *
     * 自定义mock tag获取mock值
     * @param user
     * @return
     */
    @PostMapping(value = "/mock")
    public CommonResult<SimpleUser> testMockTag(@RequestBody SubUser user) {
        return CommonResult.ok().setResult(user);
    }

    /**
     * 测试@ignore tag
     * @param pager
     * @return
     */
    @GetMapping(value = "/ignore")
    public String test(Pager pager){
        return "hello apiNote";
    }
}
