package com.aeki.AEKI.config;

import com.aeki.AEKI.models.*;
import com.aeki.AEKI.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class DataInit {
    @Bean
    public CommandLineRunner loadData(CustomerRepository customerRepository, MembershipRepository membershipRepository,
                                      ProductRepository productRepository, ProductCategoriesRepository productCategoriesRepository,
                                      ProductDetailsRepository productDetailsRepository) {

        Membership membership = new Membership();
        membership.setProductCategoryID(1);

        List<Membership> membershipList = new ArrayList<>();

        membershipList.add(membership);
        Customer customer = new Customer("Sebi", membershipList);
        membership.setCustomer(customer);


        return (args) -> {
            // save a couple of customers
            customerRepository.save(customer);
//            customerRepository.save(new Customer("Chloe"));
//            customerRepository.save(new Customer("Kim"));
//            customerRepository.save(new Customer("David"));
//            customerRepository.save(new Customer("Michelle"));
            productDetailsRepository.save(new ProductDetails("10", "5", "red", FlavorType.CHILI));
            productCategoriesRepository.save(new ProductCategories("Furniture", 1, 10));
            productRepository.save(new Product(1, "Chair", 10, "Big Chair"));


        };
    }
}
