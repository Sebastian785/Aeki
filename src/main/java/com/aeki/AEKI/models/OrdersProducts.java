package com.aeki.AEKI.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "OrdersProducts")
public class OrdersProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String productName;
    private String description;
    private Integer number;
    private Integer weight;
    private String color;
    private FlavorType flavorType;
    private Integer amount;
    private Double originalPrice;
    private Double discountPrice;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "orderId")
    private Orders orders;
}
