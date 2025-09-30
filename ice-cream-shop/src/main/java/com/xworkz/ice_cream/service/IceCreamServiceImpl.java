package com.xworkz.ice_cream.service;

import com.xworkz.ice_cream.dto.IceCreamDto;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class IceCreamServiceImpl implements IceCreamService {

    Map<String,Double> fPrice = new HashMap<>();
    Map<String,Double> coupon = new HashMap<>();
    Map<String,Double> addons = new HashMap<>();


    public IceCreamServiceImpl(){
        fPrice.put("Chocolate", 70.0);
        fPrice.put("Vanilla", 60.0);
        fPrice.put("Strawberry", 65.0);
        fPrice.put("Mango", 55.0);
        fPrice.put("Butterscotch", 75.0);
        fPrice.put("Black Current", 80.0);

        coupon.put("123qwe",30.0);
        coupon.put("456qwe",40.0);
        coupon.put("789qwe",50.0);

        addons.put("Choco Chips",5.0);
        addons.put("Nuts",6.0);
        addons.put("Nutella",7.0);
        addons.put("Sprinkles",8.0);
        addons.put("Crumbled Brownie",9.0);

    }



    @Override
    public boolean save(IceCreamDto ice_creamDto) {
        if (ice_creamDto != null)
        {
            if (ice_creamDto.getName().length() < 2 || ice_creamDto.getName().length() > 30) {
                System.out.println("Customer name is invalid");
                return false;
            }

            if (!fPrice.containsKey(ice_creamDto.getFlavour())) {
                System.out.println("Flavour is invalid");
                return false;
            }

            if (ice_creamDto.getQuantity() < 0) {
                System.out.println("Quantity is invalid");
                return false;
            }

            if (ice_creamDto.getTakeAway() == null) {
                System.out.println("Take Away input is invalid");
                return false;
            }

            if (!addons.containsKey(ice_creamDto.getAddons())) {
                System.out.println("Addons info is invalid");
                return false;
            }

            if (!coupon.containsKey(ice_creamDto.getCoupon())) {
                System.out.println("Coupon is invalid");
                return false;
            }
            System.out.println("validation passed");
            return true;
        }
        System.out.println("validation failed");
        return false;
    }

    @Override
    public Double totalPrice(IceCreamDto ice_creamDto) {
        Double price = fPrice.get(ice_creamDto.getFlavour());
        Double addonPrice = addons.get(ice_creamDto.getAddons());
        Double couponPrice = coupon.get(ice_creamDto.getCoupon());
        double totalPrice = price * ice_creamDto.getQuantity();

        if(addons.containsKey(ice_creamDto.getAddons())){
            totalPrice = totalPrice + addonPrice;
        }
        if(coupon.containsKey(ice_creamDto.getCoupon())){
            totalPrice = totalPrice * (couponPrice/100);
        }
        return totalPrice;
    }
}



