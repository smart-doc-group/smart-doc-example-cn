package com.power.doc.controller;

import com.power.common.model.CommonResult;
import com.power.doc.entity.BaseListOutPar;
import com.power.doc.entity.Car;
import com.power.doc.entity.Result;
import com.power.doc.entity.User;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * InnovateFruitController
 * @order 1
 * @author: 
 * @date: 2022/9/28 20:13
 */
@RestController
@RequestMapping("/InnovateFruit")
public class InnovateFruitController {
    /**
     * 列表
     *
     * @return: com.user.util.entity.Result<com.beijiait.vo.BaseListOutPar < com.beijiait.vo.talent.innovate.InnovateFruitList>>
     * @throws:
     * @author: 
     * @date: 2022/9/28 20:34
     */
    @PostMapping("list")
    public CommonResult<BaseListOutPar<Car>> list() {
        return null;
    }
}
