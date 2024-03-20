package com.baidu.springboot003.dao;

import com.baidu.springboot003.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    //登录
    @Select("select* from t_user where name=#{name} and password=#{password}")
    public User login(User user);
    //查询所有用户信息
    @Select("select* from t_user")
    public List<User> getAll();
    //删除
    @Delete("delete from t_user where id=#{abc}")
    public void deleteById(Integer id);
}
