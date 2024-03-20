package com.baidu.springboot001.dao;

import com.baidu.mycommon.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMapper {
        @Select("select* from t_user")
        public List<User> getAll();


}
