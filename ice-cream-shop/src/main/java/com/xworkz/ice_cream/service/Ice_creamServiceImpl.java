package com.xworkz.ice_cream.service;

import com.xworkz.ice_cream.dto.Ice_creamDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class Ice_creamServiceImpl implements Ice_creamService{

    Map<String,Integer> fPrice = new HashMap<>();
    List<String> Coupon = new ArrayList<>();

    public Ice_creamServiceImpl(){
        fPrice.put("Chocolate", 70);
        fPrice.put("Vanilla", 60);
        fPrice.put("Strawberry", 65);
        fPrice.put("Mango", 55);
        fPrice.put("Butterscotch", 75);
        fPrice.put("Black Current", 80);
    }

    @Override
    public boolean save(Ice_creamDto ice_creamDto) {
        if (ice_creamDto == null){
            System.out.println("Ice_creamDto is null");
            return false;
        }

        if ( ice_creamDto.getName().length()<2 || ice_creamDto.getName().length()>30){
            System.out.println("Customer name is invalid");
            return false;
        }

        if (ice_creamDto.getFlavour().length() <= 2 || ice_creamDto.getFlavour().length() >= 20) {
            System.out.println("Flavour is invalid");
            return false;
        }

        if (ice_creamDto.getQuantity() < 0) {
            System.out.println("Quantity is invalid");
            return false;
        }

        if ((!ice_creamDto.getTakeAway().equalsIgnoreCase("yes") && !ice_creamDto.getTakeAway().equalsIgnoreCase("no"))) {
            System.out.println("Take Away input is invalid");
            return false;
        }

        if (ice_creamDto.getAddons().length() < 0 || ice_creamDto.getAddons().length() > 50) {
            System.out.println("Addons info is invalid");
            return false;
        }

        if (ice_creamDto.getCoupon().length() < 2 || ice_creamDto.getCoupon().length() > 20) {
            System.out.println("Coupon is invalid");
            return false;
        }

        String selectedFlavour = ice_creamDto.getFlavour();
        Integer pricePerScoop = fPrice.getOrDefault(selectedFlavour, 50);
        int total = pricePerScoop * ice_creamDto.getQuantity();

        System.out.println("Unit Price for " + selectedFlavour + ": ₹" + pricePerScoop);
        System.out.println("Total Price for " + ice_creamDto.getQuantity() + " scoops: ₹" + total);

        return true;
    }
}
