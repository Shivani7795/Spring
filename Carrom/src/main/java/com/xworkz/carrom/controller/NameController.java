package com.xworkz.carrom.controller;

import com.xworkz.carrom.dto.NameDto;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
@RequestMapping("/")

public class NameController {
    public NameController()
    {
        System.out.println("creted in NameController");
    }
    @RequestMapping("/name")
    //public String name(Model model, @RequestParam("firstName") String firstName,@RequestParam("middleName") String middleName,@RequestParam("lastName") String lastName){

    public String name(Model model, NameDto nameDto){

        /*System.out.println("name: " + firstName + ", " + middleName + ", " + lastName);
        model.addAttribute("firstName",firstName);
        model.addAttribute("middleName",middleName);
        model.addAttribute("lastName",lastName);
        return "/nameResult.jsp";*/

        System.out.println("name: " + nameDto);

        model.addAttribute("NameDto" , nameDto);
        return "/nameResult.jsp";
    }
}
