package com.coolers.cloud.cloudUser.controller;

import com.coolers.cloud.cloudUser.po.User;
import com.coolers.cloud.cloudUser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public User getUser() {
        return userService.getUser();
    }

    @PostMapping("/getUserById")
    public User getUserById(String id) {
        return userService.getUserById(id);
    }
}
