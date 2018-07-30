package com.aeki.AEKI.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;

    @OneToMany(mappedBy = "order")
    private List<Product> products;

    private Integer customerId;
}
