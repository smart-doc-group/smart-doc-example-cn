package com.power.doc.controller.app;

import com.power.common.model.CommonResult;
import com.power.doc.constants.RequestValueConstant;
import com.power.doc.entity.Order;
import com.power.doc.model.FastJson;
import com.power.doc.model.LoginDto;
import com.power.doc.model.PersonCreateDto;
import com.power.doc.model.mybatisplus.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * app端接口测试
 *
 * @author yu 2018/9/4.
 */
@Slf4j
@RestController
@RequestMapping("app")
public class AppController {


    /**
     * 批量删除BOM
     *
     * @param ids 盒型BOM的id集合,英文逗号隔开
     */
    @PostMapping("/batchDelete")
    public CommonResult batchDelete(@RequestBody List<LoginDto> ids) {
        System.out.println("ids = " + ids);
        Map<String, String> record = new HashMap<>();
        record.put("a", "a");

        return CommonResult.ok();
    }


    /**
     * 创建人员
     *
     * @param createDto
     * @return
     * @apiNote 如果创建成功将会发送MQTT消息：person/{id}/create
     * @ignoreParams loginUserId
     */
    @PostMapping("")
    public CommonResult create(@RequestBody PersonCreateDto createDto) {
        return CommonResult.ok();
    }

    /**
     * 分页查询订单信息
     *
     * @param pageIndex 当前页码
     * @param pageSize  页面大小
     * @return
     */
    @GetMapping(value = "page/{pageIndex}/{pageSize}")
    public PageInfo<Order> queryPage(@PathVariable int pageIndex, @PathVariable int pageSize) {
        return null;
    }

    /**
     * app测试
     *
     * @param name      姓名|zhangsan
     * @param beginTime 开始时间
     * @param endTime   结束时间
     * @return
     */
    @PostMapping(value = "/test")
    public CommonResult test(String name, String beginTime, String endTime) {
        return CommonResult.ok().setResult(new FastJson().setUsername("yusun").setIdCard("530"));
    }

    /**
     * app测试2
     *
     * @param name      姓名
     * @param beginTime 开始时间
     * @param endTime   结束时间
     * @return
     */
    @GetMapping(value = "/test2")
    public String test2(String name, String beginTime, String endTime) {
        return "hello app";
    }

    /**
     * app测试3
     *
     * @param name      姓名
     * @param beginTime 开始时间
     * @param endTime   结束时间
     * @return
     */
    @GetMapping(value = "/test3")
    public String test3(String name, String beginTime, String endTime) {
        return "hello app";
    }

    /**
     * 常量测试
     *
     * @return
     */
    @GetMapping("test4/" + RequestValueConstant.ALL)
    public String testConstants1() {
        return null;
    }

    /**
     * 常量测试2
     *
     * @return
     */
    @GetMapping("test4/" + RequestValueConstant.ALL_NEARBY)
    public String testConstants2() {
        return null;
    }


    /**
     * 常量测试3
     *
     * @return
     */
    @GetMapping(value = RequestValueConstant.URL_PARAMS)
    public String testConstants3() {
        return null;
    }

}
