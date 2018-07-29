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
    private String CategoryName;
    private String ProductDetailsID;

    public ProductCategories() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getProductDetailsID() {
        return ProductDetailsID;
    }

    public void setProductDetailsID(String productDetailsID) {
        ProductDetailsID = productDetailsID;
    }
}
