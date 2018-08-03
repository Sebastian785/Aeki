package com.aeki.AEKI.models;

import javax.persistence.*;

@Entity
@Table(name="ProductCategories")
public class ProductCategories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String categoryName;
//    private Integer productDetailsID;
    private Integer discountPercent;

    public ProductCategories() {
    }

    public ProductCategories(String categoryName, Integer discountPercent) {
        this.categoryName = categoryName;
//        this.productDetailsID = productDetailsID;
        this.discountPercent = discountPercent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

//    public Integer getProductDetailsID() {
//        return productDetailsID;
//    }
//
//    public void setProductDetailsID(Integer productDetailsID) {
//        this.productDetailsID = productDetailsID;
//    }

    public Integer getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Integer discountPercent) {
        this.discountPercent = discountPercent;
    }
}
