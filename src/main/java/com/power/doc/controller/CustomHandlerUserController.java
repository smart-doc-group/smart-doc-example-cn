package com.power.doc.controller;

import com.power.doc.controller.parent.BaseCustomHandlerController;
import com.power.doc.service.CustomHandlerUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangyang
 * @date 2023/4/23
 */
@RestController
@RequestMapping("/customHandler/user")
public class CustomHandlerUserController extends BaseCustomHandlerController<CustomHandlerUserService> {
}
