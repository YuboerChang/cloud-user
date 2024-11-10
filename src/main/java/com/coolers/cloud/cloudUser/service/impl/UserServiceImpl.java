package com.coolers.cloud.cloudUser.service.impl;

import com.coolers.cloud.cloudUser.po.User;
import com.coolers.cloud.cloudUser.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUser() {
        return new User("001", "test");
    }
}
