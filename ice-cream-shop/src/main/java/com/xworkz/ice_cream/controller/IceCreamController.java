package com.xworkz.ice_cream.controller;

import com.xworkz.ice_cream.dto.IceCreamDto;
import com.xworkz.ice_cream.service.IceCreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class IceCreamController {
    @Autowired
    private IceCreamService ice_creamService;

    public IceCreamController(){
        System.out.println("created in Ice_creamController");
    }
    @RequestMapping("/order")
    public String order(Model model,@ModelAttribute IceCreamDto ice_creamDto){
        System.out.println("Order details:" + ice_creamDto);

        boolean save = ice_creamService.save(ice_creamDto);

        if(save) {
            Double total = ice_creamService.totalPrice(ice_creamDto);
            model.addAttribute("Ice_creamDto", ice_creamDto);
            model.addAttribute("total",total);
            return "/OrderSuccess.jsp";
        }else {
            model.addAttribute("error", "Enter valid inputs");
            return "/Order.jsp";
        }

    }
}
