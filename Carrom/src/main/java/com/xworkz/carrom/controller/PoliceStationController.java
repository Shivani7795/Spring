package com.xworkz.carrom.controller;

import com.xworkz.carrom.dto.PoliceStationDto;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Configuration
@RequestMapping("/")
public class PoliceStationController {

    public PoliceStationController() {
        System.out.println("Created PoliceController");
    }

    @RequestMapping("/police")
    public String police(Model model, PoliceStationDto policeStationDto)
    {
        System.out.println("Police Station Data: " + policeStationDto);

        model.addAttribute("PoliceStationDto",policeStationDto);

        return "/policeStationResult.jsp";
    }
}
