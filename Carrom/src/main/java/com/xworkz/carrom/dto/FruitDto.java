package com.xworkz.carrom.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@AllArgsConstructor
@ToString
public class FruitDto implements Serializable {

    private String fruitName;
    private String fruitColor;
    private Integer weight;
    private String placeOfOrigin;
    private String shopKeeperName;
    private String customerName;
    private Integer price;
    private String presentInSeason;
    private Integer noOfSeeds;
    private Integer lifespan;
}
