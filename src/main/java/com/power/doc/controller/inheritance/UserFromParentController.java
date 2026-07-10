package com.power.doc.controller;

import com.power.doc.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * user controller
 *
 * @author linwumingshi
 * @see <a href="https://github.com/TongchengOpenSource/smart-doc/issues/756">
 * issues756</a>
 */
@RestController
@RequestMapping("/api/user")
public class UserFromParentController extends AbstractParentController<User> {


    @Override
    public User info(String id) {
        User user = new User();
        user.setId(id);
        return user;
    }
}
