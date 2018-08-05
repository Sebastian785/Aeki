package com.aeki.AEKI.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerId")
    private List<Membership> memberships;

//    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
//    private List<Membership> memberships;

    public Customer() {
    }

    public Customer(String name, List<Membership> memberships) {
        this.name = name;
        this.memberships = memberships;
    }

    public Customer(String name) {
        this.name = name;
    }

    public List<Membership> getMemberships() {
        return memberships;
    }

    public void setMemberships(List<Membership> memberships) {
        this.memberships = memberships;
    }
}

