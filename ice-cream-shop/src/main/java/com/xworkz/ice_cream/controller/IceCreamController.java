package com.xworkz.ice_cream.controller;

import com.xworkz.ice_cream.dto.IceCreamDto;
import com.xworkz.ice_cream.service.IceCreamService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
@RequestMapping("/")
public class IceCreamController {
    @Autowired
    private IceCreamService ice_creamService;

    public IceCreamController(){
        System.out.println("created in Ice_creamController");
    }
    @PostMapping("/order")
    @ResponseBody

    public String order(@Valid IceCreamDto iceCreamDto,Model model, BindingResult bindingResult) throws IOException{
        System.out.println("Order details:" + iceCreamDto);

        boolean save = ice_creamService.save(iceCreamDto);

        if(save) {
            Double total = ice_creamService.totalPrice(iceCreamDto);
            model.addAttribute("Ice_creamDto", iceCreamDto);
            model.addAttribute("total",total);
            byte[] bytes=iceCreamDto.getMultipartFile().getBytes();
            Path path= Paths.get("C:\\Users\\mahes\\OneDrive\\Desktop"+iceCreamDto.getName()+System.currentTimeMillis());
            Files.write(path,bytes);
            return "/OrderSuccess.jsp";
        }else {
            model.addAttribute("error", "Enter valid inputs");
        }


            return "/Order.jsp";
        }
    }

