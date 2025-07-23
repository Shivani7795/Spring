package com.xworkz.carrom.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Configuration
@RequestMapping("/")

public class NameController {
    public NameController()
    {
        System.out.println("creted in NameController");
    }
    @RequestMapping("/name")
    public String name(Model model, @RequestParam("firstName") String firstName,@RequestParam("middleName") String middleName,@RequestParam("lastName") String lastName){
        //System.out.println("name method in NameController");
        System.out.println("name: " + firstName + ", " + middleName + ", " + lastName);
        model.addAttribute("firstName",firstName);
        model.addAttribute("middleName",middleName);
        model.addAttribute("lastName",lastName);
        return "/nameResult.jsp";
    }
}
