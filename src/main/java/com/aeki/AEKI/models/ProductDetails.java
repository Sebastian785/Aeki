package com.aeki.AEKI.models;

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

    public ProductDetails(Integer number, Integer weight, String color, FlavorType flavorType) {
        this.number = number;
        this.weight = weight;
        this.color = color;
        this.flavorType = flavorType;
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
}
