package com.aeki.AEKI.models;

import javax.persistence.*;

@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer productCategoryID;
    private String productName;
    private double price;
    private String description;

//    @JsonBackReference
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "orderId")
//    private Orders orderList;

    public Product() {
    }

    public Product(Integer productCategoryID, String productName, double price, String description) {
        this.productCategoryID = productCategoryID;
        this.productName = productName;
        this.price = price;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductCategoryID() {
        return productCategoryID;
    }

    public void setProductCategoryID(Integer productCategoryID) {
        this.productCategoryID = productCategoryID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public String getDiscountPrice() {
//        return discountPrice;
//    }
//
//    public void setDiscountPrice(String discountPrice) {
//        this.discountPrice = discountPrice;
//    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productCategoryID='" + productCategoryID + '\'' +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

