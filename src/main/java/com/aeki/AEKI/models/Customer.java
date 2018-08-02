package com.aeki.AEKI.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

//    @JsonManagedReference
//    @OneToMany(mappedBy = "customerOrders")
//    private List<Orders> orderLists;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Membership> memberships;


    public Customer() {
    }

    public Customer(String name, List<Membership> memberships) {
        this.name = name;
        this.memberships = memberships;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Membership> getMemberships() {
        return memberships;
    }

    public void setMemberships(List<Membership> memberships) {
        this.memberships = memberships;
    }
}

