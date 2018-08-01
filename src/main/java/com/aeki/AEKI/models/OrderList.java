package com.aeki.AEKI.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "OrderList")
public class OrderList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    @Column
    private String name;

    @JsonManagedReference
    @OneToMany(mappedBy = "orderList")
    private List<Product> products;

    private Integer customerId;

    public OrderList() {
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "OrderList{" +
                "orderId=" + orderId +
                ", name='" + name + '\'' +
                ", products=" + products +
                ", customerId=" + customerId +
                '}';
    }
}
