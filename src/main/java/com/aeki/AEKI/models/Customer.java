package com.aeki.AEKI.models;

import javax.persistence.*;

@Entity
@Table(name="Customer")
public class Customer {

    @Id
    @GeneratedValue
    private long id;
    @Column
    private String Name;

    public Customer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

