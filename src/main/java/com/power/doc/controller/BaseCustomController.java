package com.power.doc.controller;

import com.power.doc.model.UserDetail;
import com.power.doc.service.BizBaseServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 测试复杂封装性controller
 * @author yusun
 *
 */
@RestController
@RequestMapping("/base_custom")
public class BaseCustomController extends BizBaseController<BizBaseServiceImpl, UserDetail>{
}
