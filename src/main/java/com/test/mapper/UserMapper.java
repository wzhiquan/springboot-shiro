package com.test.mapper;

import com.test.domain.User;

public interface UserMapper {

    public User findByName(String name);

    public User findById(Integer id);
}
