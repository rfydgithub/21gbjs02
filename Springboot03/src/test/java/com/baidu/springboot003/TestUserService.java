package com.baidu.springboot003;


import com.baidu.springboot003.pojo.User;
import com.baidu.springboot003.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestUserService {
    @Autowired
    private UserService userService;
    @Test
    public void testLogin(){
        System.out.println("------hello------");
        System.out.println("userService:"+userService);
        User user=new User();
        user.setName("admin");
        user.setPassword("admin");
        //执行查询
        User user2=userService.login(user);
        System.out.println("user2:"+user2);
    }
    //测试查询所有用户信息
    @Test
    public void testGetAll(){
        List<User> list=userService.getAll();
        for (User user:list){
            System.out.println(user);
        }
    }
}
