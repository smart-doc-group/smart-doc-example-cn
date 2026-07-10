package com.power.doc.controller;

import com.power.doc.controller.parent.BaseCustomHandlerController;
import com.power.doc.service.CustomHandlerUserRoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CustomHandlerUserRoleController
 *
 * @author yangyang
 * @date 2023/4/23
 */
@RestController
@RequestMapping("/customHandler/userRole")
public class CustomHandlerUserRoleController extends BaseCustomHandlerController<CustomHandlerUserRoleService> {
}
