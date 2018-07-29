package com.aeki.AEKI.controllers;

import com.aeki.AEKI.models.Customer;
import com.aeki.AEKI.models.FlavorType;
import com.aeki.AEKI.models.Membership;
import com.aeki.AEKI.repositories.CustomerRepository;
import com.aeki.AEKI.repositories.FlavorTypeRepository;
import com.aeki.AEKI.repositories.MembershipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") String id) {
        return customerRepository.findById(id)
                .map(customer -> ResponseEntity.ok().body(customer))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/flavortype")
    public List<FlavorType> getFlavorType() {
        return flavorTypeRepository.findAll();
    }

    @GetMapping("/membership")
    public List<Membership> getMembership() {
        return membershipRepository.findAll();
    }



}
