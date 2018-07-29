package com.aeki.AEKI.models;

import javax.persistence.*;

@Entity
@Table(name="Customer")
public class Customer {

    @Id
    @GeneratedValue
    private String id;
    private String Name;
    private String MembershipID;

    public Customer() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMembershipID() {
        return MembershipID;
    }

    public void setMembershipID(String membershipID) {
        MembershipID = membershipID;
    }
}

