package com.xworkz.carrom.controller;

import com.xworkz.carrom.dto.RtoDto;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Configuration
@RequestMapping("/")
public class RTOController {

    public RTOController() {
        System.out.println("Created RTOController");
    }

    @RequestMapping("/rto")

    /*public String rto(
            Model model,
            @RequestParam("ownerName") String ownerName,
            @RequestParam("vehicleNumber") String vehicleNumber,
            @RequestParam("vehicleType") String vehicleType,
            @RequestParam("vehicleColor") String vehicleColor,
            @RequestParam("purchasedPlace") String purchasedPlace,
            @RequestParam("purchasedYear") int purchasedYear) {*/

    public String rto(
            Model model,
            RtoDto rtoDto) {


        /*System.out.println("RTO Details: " + ownerName + ", " + vehicleNumber + ", " + vehicleType + ", " +
                vehicleColor + ", " + purchasedPlace + ", " + purchasedYear);*/

        System.out.println("RTO Details: " + rtoDto);


        /*model.addAttribute("ownerName", ownerName);
        model.addAttribute("vehicleNumber", vehicleNumber);
        model.addAttribute("vehicleType", vehicleType);
        model.addAttribute("vehicleColor", vehicleColor);
        model.addAttribute("purchasedPlace", purchasedPlace);
        model.addAttribute("purchasedYear", purchasedYear);*/

        model.addAttribute("RTODto",rtoDto);

        return "/rtoResult.jsp";
    }
}
