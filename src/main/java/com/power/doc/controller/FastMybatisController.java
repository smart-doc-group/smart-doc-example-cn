package com.power.doc.controller;

import com.gitee.fastmybatis.core.query.param.PageParam;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * fastmybatis
 */
@RestController
public class FastMybatisController {

  /**
   * fastmybatis测试
   * @param param
   */
  @PostMapping("/fastmybatis")
  public void test(PageParam param){

  }
}
