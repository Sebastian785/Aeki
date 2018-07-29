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
    private String Number;
    private String Weight;
    private String Color;
    private String FlavorTypeID;

    public ProductDetails() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getFlavorTypeID() {
        return FlavorTypeID;
    }

    public void setFlavorTypeID(String flavorTypeID) {
        FlavorTypeID = flavorTypeID;
    }
}
