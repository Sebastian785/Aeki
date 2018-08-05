package com.aeki.AEKI.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ProductCategories")
public class ProductCategories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String categoryName;
    private Integer discountPercent;

    public ProductCategories() {
    }

    public ProductCategories(String categoryName, Integer discountPercent) {
        this.categoryName = categoryName;
        this.discountPercent = discountPercent;
    }
}
