package com.coolers.cloud.cloudUser.service;

import com.coolers.cloud.cloudUser.po.User;

public interface UserService {
    public User getUser();

    public User getUserById(String id);
}
