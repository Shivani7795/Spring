package com.xworkz.dmart;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Getter
@RequiredArgsConstructor
@Entity
@Table(name = "product_info")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "productName")
    private String productName;

    @Column(name = "price")
    private Double price;

    @Column(name = "mfd")
    private String mfd;

    @Column(name = "company")
    private String company;
}
