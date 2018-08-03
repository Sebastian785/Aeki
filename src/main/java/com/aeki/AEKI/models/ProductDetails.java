package com.aeki.AEKI.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "ProductDetails")
public class ProductDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer number;
    private Integer weight;
    private String color;
    @Enumerated(EnumType.STRING)
    private FlavorType flavorType;
    private Integer productCategoryId;
    private Integer productId;

    public ProductDetails(Integer number, Integer weight, String color, FlavorType flavorType, Integer productCategoryId, Integer productId) {
        this.number = number;
        this.weight = weight;
        this.color = color;
        this.flavorType = flavorType;
        this.productCategoryId = productCategoryId;
        this.productId=productId;
    }

    public ProductDetails() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public FlavorType getFlavorType() {
        return flavorType;
    }

    public void setFlavorType(FlavorType flavorType) {
        this.flavorType = flavorType;
    }

    public Integer getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Integer productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

}



