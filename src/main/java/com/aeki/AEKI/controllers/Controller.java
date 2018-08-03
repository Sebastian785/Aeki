package com.aeki.AEKI.controllers;

import com.aeki.AEKI.models.*;
import com.aeki.AEKI.repositories.*;
import com.aeki.AEKI.service.OrderService;
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
    MembershipRepository membershipRepository;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    ProductCategoriesRepository productCategoriesRepository;
    @Autowired
    ProductDetailsRepository productDetailsRepository;
    @Autowired
    OrderService orderService;


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

    @GetMapping("/memberships")
    public List<Membership> getMemberships() {
        return membershipRepository.findAll();
    }

    @GetMapping("/orders")
    public ResponseEntity<List<Orders>> getOrders() {
        List<Orders> result = new ArrayList<>();
        List<Orders> allOrders = orderRepository.findAll();
        for (Orders o : allOrders) {
            result.add(o);
        }
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/orderlist")
    public List<Orders> getOrderList() {
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

    @PostMapping("/orders")
    public ResponseEntity<Orders> createOrder(@RequestBody OrderRequest orderRequest) {
        return ResponseEntity.ok().body(orderService.createOrder(orderRequest));
    }

}
