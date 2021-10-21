package com.test.service;

import com.test.domain.User;

public interface UserService {

    public User findByName(String name);

    public User findById(Integer id);
}
