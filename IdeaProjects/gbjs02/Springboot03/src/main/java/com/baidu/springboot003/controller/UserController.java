package com.baidu.springboot003.controller;

import com.baidu.springboot003.pojo.User;
import com.baidu.springboot003.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.AuthProvider;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(User user, HttpSession session, HttpServletRequest request) {
        System.out.println("----login-----");
        System.out.println("user:" + user);

        User user2 = userService.login(user);
        if (user2 != null) {
            session.setAttribute("user2", user2);
            System.out.println("User information stored in session: " + user2);
            //重定向到getAll
            return "redirect:/user/getAll";

        } else {
            request.setAttribute("msg", "密码或用户名不正确!");
            return "index";

        }
    }

    //查询所有用户信息
    @RequestMapping("/getAll")
    public String getAll(HttpServletRequest request) {
        try {
            // 可能抛出异常的代码
            List<User> list = userService.getAll();
            request.setAttribute("list", list);
            return "query";
        } catch (Exception e) {
            // 处理异常的代码
            e.printStackTrace();
            return "errorPage"; // 返回一个错误页面或者其他适当的处理方式
        }
    }
      @RequestMapping("/deleteUserById/{id}")
       public String deleteUserById(@PathVariable("id")Integer id){
        System.out.println("----deleteUserById---");
        System.out.println("id:"+id);
        return "redirect:/user/getAll";
    }

}




