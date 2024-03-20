package com.baidu.springboot003.service;

import com.baidu.springboot003.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    //登录
    public User login(User user);
    //查询所有用户信息
    public List<User> getAll();
    //删除
    public void deleteById(Integer id);
}
