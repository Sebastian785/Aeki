package com.aeki.AEKI.models;

import javax.persistence.*;

@Entity
@Table(name = "Membership")
public class Membership {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer productCategoryID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerId")
    private Customer customer;

    public Membership() {
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
