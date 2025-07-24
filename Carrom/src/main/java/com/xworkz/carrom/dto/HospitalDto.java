package com.xworkz.carrom.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class HospitalDto {
    private String hospitalName;
    private String doctorName;
    private Integer noPatients;
    private Integer noWard;
    private Integer noChairs;
    private String location;

    public HospitalDto(){
        System.out.println("created HospitalName");
    }
}
