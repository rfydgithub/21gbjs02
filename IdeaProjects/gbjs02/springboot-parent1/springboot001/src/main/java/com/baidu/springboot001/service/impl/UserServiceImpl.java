package com.baidu.springboot001.service.impl;

import com.baidu.mycommon.pojo.User;
import com.baidu.springboot001.dao.UserMapper;
import com.baidu.springboot001.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> getAll(){
        return userMapper.getAll();
    }
}

