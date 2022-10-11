package com.jie.community.service.impl;

import com.jie.community.dao.UserMapper;
import com.jie.community.pojo.User;
import com.jie.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mj123
 * @version 1.0
 * @date 2022/10/2 21:26:00
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(int id) {
        return userMapper.selectById(id);
    }
}
