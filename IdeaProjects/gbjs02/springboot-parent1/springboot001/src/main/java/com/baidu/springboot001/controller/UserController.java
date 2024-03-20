package com.baidu.springboot001.controller;

import com.baidu.mycommon.pojo.User;
import com.baidu.springboot001.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController
{
    @Value("${age}")
    private Integer age;
    @Value("${name}")
    private String name;
    @Autowired
    private UserService userService;
    @RequestMapping("/getAll")
    public String getAll(HttpServletRequest request){
        System.out.println("--------getAll-------");
        List<User> list=userService.getAll() ;
        request.setAttribute("list",list);
        return "success";
    }
    @RequestMapping("/test")
    public String test(){
        System.out.println("----test-----");
        System.out.println("name:"+name+"age:"+age);
        return "success";
    }


}
