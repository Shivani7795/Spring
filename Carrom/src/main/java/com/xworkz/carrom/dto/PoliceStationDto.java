package com.xworkz.carrom.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@ToString
@AllArgsConstructor
public class PoliceStationDto implements Serializable {

    private String stationName;
    private String location;
    private Integer noOfPolice;
    private Integer noOfCases;
    private Integer noOfVehicles;
    private Integer noOfCells;
    private String headOfficerName;
    private String stationPhNumber;
    private Integer noOfConstable;
    private Integer noOfLadyPolice;
}