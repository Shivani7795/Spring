package com.xworkz.carrom.controller;

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
            @RequestParam("hospitalName") String hospitalName,
            @RequestParam("doctorName") String doctorName,
            @RequestParam("noPatients") int noPatients,
            @RequestParam("noWard") int noWard,
            @RequestParam("noChairs") int noChairs,
            @RequestParam("location") String location) {

        System.out.println("Hospital Details: " + hospitalName + ", " + doctorName + ", " +
                noPatients + ", " + noWard + ", " + noChairs + ", " + location);

        model.addAttribute("hospitalName", hospitalName);
        model.addAttribute("doctorName", doctorName);
        model.addAttribute("noPatients", noPatients);
        model.addAttribute("noWard", noWard);
        model.addAttribute("noChairs", noChairs);
        model.addAttribute("location", location);

        return "/hospitalResult.jsp";
    }
}
