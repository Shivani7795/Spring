package com.xworkz.carrom.controller;

import com.xworkz.carrom.dto.HospitalDto;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Configuration
@RequestMapping("/")
public class HospitalController {

    public HospitalController() {
        System.out.println("Created HospitalController");
    }

    @RequestMapping("/hospital")
    public String hospital(
            Model model,
            HospitalDto hospitalDto) {

        System.out.println("Hospital Details: " + hospitalDto);

        model.addAttribute("HospitalDto",hospitalDto);


        return "/hospitalResult.jsp";
    }
}
