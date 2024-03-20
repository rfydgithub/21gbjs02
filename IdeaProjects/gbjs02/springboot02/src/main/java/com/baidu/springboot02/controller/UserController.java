package com.baidu.springboot02.controller;

import com.baidu.springboot02.pojo.User;
import jakarta.servlet.http.HttpServletRequest;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    //获取用户名
    @RequestMapping("/getName")
    public String getName(HttpServletRequest request) {
        System.out.println("-------getName-------");
        String name = "<h2>阮飞宇</h2>";
//将用户名保存到request中
        request.setAttribute("name", name);
        return "success";

    }

    @RequestMapping("/getUser")
    public String getUser(HttpServletRequest request) {
        System.out.println("----getUser-----");
        User user = new User("rfy", "111", 20, new Date());
        request.setAttribute("user", user);
        return "success";
    }

    @RequestMapping("/getList")
    public String getList(HttpServletRequest request, HttpSession session) {
        System.out.println("-------getList-------");
        List<User> list = new ArrayList<>();
        list.add(new User("rfy1", "111", 20, new Date()));
        list.add(new User("rfy2", "222", 20, new Date()));
        list.add(new User("rfy3", "333", 20, new Date()));
        list.add(new User("rfy4", "444", 20, new Date()));
        //request.setAttribute("list",list);
        session.setAttribute("list", list);
        return "test01";
    }

    @RequestMapping("/testHref")
    public String testHref(Integer id, String name) {
        System.out.println("------testHref-----");
        System.out.println("id:" + id);
        System.out.println("name:" + name);
        return "test02";
    }

    @RequestMapping("/myHref")
    public String myHref(Integer id, String name) {
        System.out.println("------testHref-----");
        System.out.println("id:" + id);
        System.out.println("name:" + name);
        return "test02";
    }

    @RequestMapping("/testRestfull/{id}/{name}")
    public String testRestfull(@PathVariable("id") Integer ids, @PathVariable("name") String name) {
        System.out.println("-----testRestfull-----");
        System.out.println("id:" + ids);
        System.out.println("name:" + name);
        return "test02";
    }

    @RequestMapping("/testAction")
    public String testAction(User user,HttpServletRequest request){
        System.out.println("----testAction------");
       System.out.println("user:"+user);
       request.setAttribute("user",user);
       return "test03";
    }
}
