package com.aeki.AEKI.controllers;

import com.aeki.AEKI.models.Customer;
import com.aeki.AEKI.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class Controller {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/customers")
    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }



}
