package com.xworkz.carrom.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
@RequestMapping("/")
public class FirstController {
    public FirstController(){
        System.out.println("creted in FirstController");
    }
    @RequestMapping("/onSend")
    public String onSend(){
        System.out.println("onSend method in FirstController");
        return "index.jsp";
    }
}
