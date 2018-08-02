package com.aeki.AEKI.models;

import javax.persistence.*;

@Entity
@Table(name="ProductDetails")
public class ProductDetails {

    @Id
    @GeneratedValue
    private Integer id;
    private String number;
    private String weight;
    private String color;
    @Enumerated(EnumType.STRING)
    private FlavorType flavorType;

    public ProductDetails(String number, String weight, String color, FlavorType flavorType) {
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
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
