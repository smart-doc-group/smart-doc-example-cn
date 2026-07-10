package com.power.doc.controller.parent;

import com.power.doc.entity.RoleDTO;
import com.power.doc.entity.SimpleUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 购物
 * @author xzli15
 * @date 2021/8/30
 **/
@RestController
@RequestMapping("/itemShop-item")
public class ShopItemController extends BaseController<SimpleUser,RoleDTO,String,ShopService> {
}
