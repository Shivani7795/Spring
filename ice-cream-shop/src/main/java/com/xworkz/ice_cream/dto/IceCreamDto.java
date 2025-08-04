package com.xworkz.ice_cream.dto;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

@Getter
@ToString
@AllArgsConstructor
@Data
public class IceCreamDto {

//    @Size(min=2,max=50)
    private String name;
    private String flavour;
    private Integer quantity;
    private String takeAway;
    private String addons;
    private String coupon;
    private MultipartFile multipartFile;
}
