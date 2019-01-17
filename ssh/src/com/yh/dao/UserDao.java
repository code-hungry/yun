package com.yh.dao;

import com.yh.pojo.User;

public interface UserDao {
    public User findUserByAccount(String code);
}
