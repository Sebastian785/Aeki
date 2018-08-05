package com.aeki.AEKI.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "ProductDetails")
public class ProductDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer number;
    private Integer weight;
    private String color;
    @Enumerated(EnumType.STRING)
    private FlavorType flavorType;
    private Integer productCategoryId;

    @JsonBackReference
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productId")
    private Product product;

    public ProductDetails() {
    }

    public ProductDetails(Integer number, Integer weight, String color, FlavorType flavorType, Integer productCategoryId) {
        this.number = number;
        this.weight = weight;
        this.color = color;
        this.flavorType = flavorType;
        this.productCategoryId = productCategoryId;
    }
}



