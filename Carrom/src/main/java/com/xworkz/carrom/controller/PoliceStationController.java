package com.xworkz.carrom.controller;

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
    public String police(
            Model model,
            @RequestParam("stationName") String stationName,
            @RequestParam("location") String location,
            @RequestParam("noOfPolice") int noOfPolice,
            @RequestParam("noOfCases") int noOfCases,
            @RequestParam("noOfVehicles") int noOfVehicles,
            @RequestParam("noOfCells") int noOfCells,
            @RequestParam("headOfficerName") String headOfficerName,
            @RequestParam("stationPhNumber") String stationPhNumber,
            @RequestParam("noOfConstable") int noOfConstable,
            @RequestParam("noOfLadyPolice") int noOfLadyPolice
    ) {
        System.out.println("Police Station Data: " + stationName + ", " + location + ", " + noOfPolice + ", "
                + noOfCases + ", " + noOfVehicles + ", " + noOfCells + ", " + headOfficerName + ", "
                + stationPhNumber + ", " + noOfConstable + ", " + noOfLadyPolice);

        model.addAttribute("stationName", stationName);
        model.addAttribute("location", location);
        model.addAttribute("noOfPolice", noOfPolice);
        model.addAttribute("noOfCases", noOfCases);
        model.addAttribute("noOfVehicles", noOfVehicles);
        model.addAttribute("noOfCells", noOfCells);
        model.addAttribute("headOfficerName", headOfficerName);
        model.addAttribute("stationPhNumber", stationPhNumber);
        model.addAttribute("noOfConstable", noOfConstable);
        model.addAttribute("noOfLadyPolice", noOfLadyPolice);

        return "/policeStationResult.jsp";
    }
}
