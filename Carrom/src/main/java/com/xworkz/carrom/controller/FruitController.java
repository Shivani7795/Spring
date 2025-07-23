package com.xworkz.carrom.controller;

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
            @RequestParam String fruitName,
            @RequestParam String fruitColor,
            @RequestParam int weight,
            @RequestParam String placeOfOrigin,
            @RequestParam String shopKeeperName,
            @RequestParam String customerName,
            @RequestParam int price,
            @RequestParam String presentInSeason,
            @RequestParam int noOfSeeds,
            @RequestParam int lifespan,
            Model model) {

        System.out.println("Fruit Details Collected");

        model.addAttribute("fruitName", fruitName);
        model.addAttribute("fruitColor", fruitColor);
        model.addAttribute("weight", weight);
        model.addAttribute("placeOfOrigin", placeOfOrigin);
        model.addAttribute("shopKeeperName", shopKeeperName);
        model.addAttribute("customerName", customerName);
        model.addAttribute("price", price);
        model.addAttribute("presentInSeason", presentInSeason);
        model.addAttribute("noOfSeeds", noOfSeeds);
        model.addAttribute("lifespan", lifespan);

        return "/fruitResult.jsp";
    }
}
