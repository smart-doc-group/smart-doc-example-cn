package com.power.doc.controller;

import com.power.common.model.CommonResult;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

/**
 * 测试session参数忽略
 *
 * @author yu on 2021/11/10
 */
@RestController
@RequestMapping("session")
public class SessionSettingController {

  /**
   * session忽略
   *
   * @param userName 忽略用户名
   * @param appName 应用名称
   */
  @GetMapping("/attribute")
  public CommonResult testSession(@SessionAttribute String userName,String appName) {
    return CommonResult.ok();
  }
}
