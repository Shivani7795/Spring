package com.xworkz.ice_cream.controller;

import com.xworkz.ice_cream.dto.Ice_creamDto;
import com.xworkz.ice_cream.service.Ice_creamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Ice_creamController {
    @Autowired
    private Ice_creamService ice_creamService;

    public Ice_creamController(){
        System.out.println("created in Ice_creamController");
    }
    @RequestMapping("/order")
    public String order(Model model,@ModelAttribute Ice_creamDto ice_creamDto){
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







        /*@Autowired
        private OrderService orderService;

        @RequestMapping("/order")
        public String handleOrder(Model model, @ModelAttribute OrderDto dto) {
            boolean saved = orderService.validateAndSave(dto);
            if (saved) {
                model.addAttribute("OrderDto", dto);
                return "/orderSuccess.jsp";
            } else {
                model.addAttribute("error", "Validation Failed");
                return "/order.jsp";
            }
        }*/

    }
}
