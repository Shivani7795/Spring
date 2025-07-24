package com.xworkz.carrom.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@ToString
@AllArgsConstructor
public class RtoDto implements Serializable {

    private String ownerName;
    private String vehicleNumber;
    private String vehicleType;
    private String vehicleColor;
    private String purchasedPlace;
    private Integer purchasedYear;

    public RtoDto() {
        System.out.println("Created RtoDto");
    }
}
