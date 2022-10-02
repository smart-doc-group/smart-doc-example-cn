package com.power.doc.controller;

import com.power.common.model.CommonResult;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 多method测试
 * @author yu3.sun on 2022/10/1
 */
@RestController
@RequestMapping("/multi/mapping/methods")
public class MultiMappingMethodsController {

  /**
   * 多method
   * @apiNote smart-doc放弃支持用户使用多个method
   * @return
   */
  @RequestMapping(value = "startJob", method = {RequestMethod.POST, RequestMethod.GET})
  public CommonResult test1(){
    return CommonResult.ok();
  }

}
