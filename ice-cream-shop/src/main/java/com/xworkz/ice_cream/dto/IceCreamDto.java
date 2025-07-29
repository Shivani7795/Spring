package com.xworkz.ice_cream.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class IceCreamDto {
    private String name;
    private String flavour;
    private Integer quantity;
    private String takeAway;
    private String addons;
    private String coupon;
}
