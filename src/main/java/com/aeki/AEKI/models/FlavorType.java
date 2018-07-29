package com.aeki.AEKI.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FlavorType")
public class FlavorType {

    @Id
    @GeneratedValue
    private String id;
    private String FlavorName;

    public FlavorType() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFlavorName() {
        return FlavorName;
    }

    public void setFlavorName(String flavorName) {
        FlavorName = flavorName;
    }
}
