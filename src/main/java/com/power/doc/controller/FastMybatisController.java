package com.power.doc.controller;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gitee.fastmybatis.core.query.param.PageParam;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * fastmybatis
 */
@RestController
public class FastMybatisController {

  /**
   * fastmybatis测试
   */
  @PostMapping("/fastmybatis")
  public void test(InParam param) {

  }

  @JsonIgnoreProperties({"start", "limit"})
  public static class InParam extends PageParam implements Serializable {

    /**
     * 错误码
     */
    private int code;
  }
}
