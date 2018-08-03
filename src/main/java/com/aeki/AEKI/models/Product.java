package com.aeki.AEKI.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String productName;
    private double price;
    private String description;

//    @JsonBackReference
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "orderId")
//    private Orders orderList;

    public Product() {
    }

    public Product(String productName, double price, String description) {
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



    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productCategoryID='" + '\'' +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

