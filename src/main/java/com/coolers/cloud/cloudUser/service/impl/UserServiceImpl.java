package com.coolers.cloud.cloudUser.service.impl;

import com.coolers.cloud.cloudUser.po.User;
import com.coolers.cloud.cloudUser.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUser() {
        return new User("001", "test-example-1");
    }

    @Override
    public User getUserById(String id) {
        return new User("002", "test-example-2");
    }
}
