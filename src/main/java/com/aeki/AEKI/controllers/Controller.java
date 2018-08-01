package com.aeki.AEKI.controllers;

import com.aeki.AEKI.models.*;
import com.aeki.AEKI.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class Controller {

    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    FlavorTypeRepository flavorTypeRepository;
    @Autowired
    MembershipRepository membershipRepository;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    ProductCategoriesRepository productCategoriesRepository;
    @Autowired
    ProductDetailsRepository productDetailsRepository;


    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") Integer id) {
        return customerRepository.findById(id)
                .map(customer -> ResponseEntity.ok().body(customer))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/customers")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    @GetMapping("/flavortypes")
    public List<FlavorType> getFlavorTypes() {
        return flavorTypeRepository.findAll();
    }

    @GetMapping("/memberships")
    public List<Membership> getMemberships() {
        return membershipRepository.findAll();
    }

    @GetMapping("/orders")
    public ResponseEntity<List<OrderList>> getOrders() {

//        System.out.println("Products: " + getProducts().toString());
//        System.out.println("Orders: " + getOrders().toString());
        List<OrderList> result = new ArrayList<>();
        List<OrderList> allOrders = orderRepository.findAll();
        for (OrderList o : allOrders) {
            result.add(o);
        }
        return ResponseEntity.ok().body(result);
    }


    @GetMapping("/orderlist")
    public List<OrderList> getOrderList() {
        return orderRepository.findAll();
    }


    @GetMapping("/products")
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/productsCategories")
    public List<ProductCategories> getProductsCategories() {
        return productCategoriesRepository.findAll();
    }

    @GetMapping("/productsDetails")
    public List<ProductDetails> getProductsDetails() {
        return productDetailsRepository.findAll();
    }

}
