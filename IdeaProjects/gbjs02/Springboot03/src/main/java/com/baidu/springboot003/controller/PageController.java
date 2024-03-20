package com.baidu.springboot003.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/index.html")
    public String toIndex(){
        System.out.println("-----toIndex------");
        return "index";
    }

}
