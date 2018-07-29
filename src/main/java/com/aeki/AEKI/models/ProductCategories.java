package com.aeki.AEKI.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProductCategories")
public class ProductCategories {

    @Id
    @GeneratedValue
    private String id;
    private String categoryName;
    private String productDetailsID;

    public ProductCategories() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getProductDetailsID() {
        return productDetailsID;
    }

    public void setProductDetailsID(String productDetailsID) {
        this.productDetailsID = productDetailsID;
    }
}
