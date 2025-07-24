package com.xworkz.carrom.controller;

import com.xworkz.carrom.dto.FruitDto;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Configuration
@RequestMapping("/")
public class FruitController {

    public FruitController() {
        System.out.println("Created FruitController");
    }

    @RequestMapping("/fruit")
    public String fruit(
            FruitDto fruitDto,
            Model model) {

        System.out.println("Fruit Details Collected:" + fruitDto);

        model.addAttribute("FruitDto",fruitDto);

        return "/fruitResult.jsp";
    }
}
