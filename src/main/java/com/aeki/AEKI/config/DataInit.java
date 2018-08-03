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
        Boolean insert = true;
        if (insert) {
            Membership membership = new Membership();
            membership.setProductCategoryID(1);

            List<Membership> membershipList = new ArrayList<>();

            membershipList.add(membership);
            Customer customer = new Customer("Sebi", membershipList);
            membership.setCustomer(customer);


            return (args) -> {
                // save a couple of customers
                customerRepository.save(customer);
                customerRepository.save(new Customer("Claudiu"));
//            customerRepository.save(new Customer("Kim"));
//            customerRepository.save(new Customer("David"));
//            customerRepository.save(new Customer("Michelle"));


                productCategoriesRepository.save(new ProductCategories("Furniture", 1, 10));
                productCategoriesRepository.save(new ProductCategories("Textiles", 2, 20));
                productCategoriesRepository.save(new ProductCategories("Hot Dogs", 3, 30));

                productDetailsRepository.save(new ProductDetails(1, 20, null, null));
                productDetailsRepository.save(new ProductDetails(2, 0, "Red", null));
                productDetailsRepository.save(new ProductDetails(null, null, null, FlavorType.CHILI));

                productRepository.save(new Product(1, "Chair", 50, "Little Chair"));
                productRepository.save(new Product(2, "Carpet", 30, "Small Carpet"));

            };
        }
        return null;
    }
}
