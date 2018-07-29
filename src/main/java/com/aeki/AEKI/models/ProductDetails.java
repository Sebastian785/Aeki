package com.aeki.AEKI.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProductDetails")
public class ProductDetails {

    @Id
    @GeneratedValue
    private String id;
    private String number;
    private String weight;
    private String color;
    private String flavorTypeID;

    public ProductDetails() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getFlavorTypeID() {
        return flavorTypeID;
    }

    public void setFlavorTypeID(String flavorTypeID) {
        this.flavorTypeID = flavorTypeID;
    }
}
