package com.baidu.springboot003.service.impl;

import com.baidu.springboot003.service.UserService;
import com.baidu.springboot003.dao.UserMapper;
import com.baidu.springboot003.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User login(User user){
        return userMapper.login(user);
    }
   //查询所有用户信息

    public List<User> getAll() {
        return userMapper.getAll();
    }

    public void deleteById(Integer id) {
        userMapper.deleteById(id);
    }
}
