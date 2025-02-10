package com.siddhant.SpringBoot_ShoppingProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Product {
    @Id
    private int prodId;
    private String prodName;
    private int prodPrice;

    public Product() {

    }
}
