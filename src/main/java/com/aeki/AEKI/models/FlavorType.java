package com.aeki.AEKI.models;

import javax.persistence.*;

@Entity
@Table(name = "FlavorType")
public class FlavorType {

    @Id
    @GeneratedValue
    private String id;
    @Column(name = "FlavorName")
    private String flavorName;

    public FlavorType() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFlavorName() {
        return flavorName;
    }

    public void setFlavorName(String flavorName) {
        this.flavorName = flavorName;
    }
}
