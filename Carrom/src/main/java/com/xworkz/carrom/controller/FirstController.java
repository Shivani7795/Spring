package com.xworkz.carrom.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
@RequestMapping("/")
public class FirstController {
    public FirstController(){
        System.out.println("creted in FirstController");
    }
    @RequestMapping("/send")
    public String sending(){
        System.out.println("sending method inFirstController");
        return "index.jsp";
    }
}
