package com.aeki.AEKI.models;

import javax.persistence.*;

@Entity
@Table(name = "Membership")
public class Membership {

    @Id
    @GeneratedValue
    private String id;
    private String productCategoryID;

    public Membership() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductCategoryID() {
        return productCategoryID;
    }

    public void setProductCategoryID(String productCategoryID) {
        this.productCategoryID = productCategoryID;
    }
}
