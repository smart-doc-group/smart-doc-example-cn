package com.power.doc.controller;

import com.power.doc.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Test ResponseEntity
 *
 * @author yu 2019/10/19.
 */
@RestController
public class ResponseEntityController {

    /**
     * ResponseEntity return List
     *
     * @return
     */
    @GetMapping("/responseEntity/list")
    public ResponseEntity<List<User>> queryByParentId() {
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setPhone("1111");
        users.add(user);
        return ResponseEntity.ok(users);
    }
}

