package com.baidu.springboot001;

import com.baidu.mycommon.pojo.User;
import com.baidu.springboot001.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
@SpringBootTest
public class TestUserService {
    @Autowired
    private UserService userService;
    @Test
    public void testGetAll(){
        List<User> list=userService.getAll();
        for (User user:list){
            System.out.println(user);
        }

    }
}
