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

    public Membership createMembership(Integer catId) {
        Membership membership = new Membership();
        membership.setProductCategoryID(catId);
        return membership;
    }

    @Bean
    public CommandLineRunner loadData(CustomerRepository customerRepository,
                                      MembershipRepository membershipRepository,
                                      ProductRepository productRepository,
                                      ProductCategoriesRepository productCategoriesRepository,
                                      ProductDetailsRepository productDetailsRepository) {

        Boolean insert = true;
        if (insert) {
            Membership membership = new Membership();
            List<Membership> membershipList = new ArrayList<>();

            membershipList.add(createMembership(1));
            membershipList.add(createMembership(3));

            Customer customer = new Customer("Sebi", membershipList);
            membership.setCustomer(customer);

            return (args) -> {
                customerRepository.save(new Customer("Claudiu"));
                List<Membership> memberships = customer.getMemberships();
                for (Membership membershipAll : memberships) {
                    membershipAll.setCustomer(customer);
                }
                customerRepository.save(customer);

                productCategoriesRepository.save(new ProductCategories("Furniture", 10));
                productCategoriesRepository.save(new ProductCategories("Textiles", 20));
                productCategoriesRepository.save(new ProductCategories("Hot Dogs", 30));

                productRepository.save(new Product("Carpet", 30, "Small Carpet"));
                productRepository.save(new Product("Wardrobe", 50, "Cool Wardrobe"));
                productRepository.save(new Product("Rug", 50, "Magic Rug"));
                productRepository.save(new Product("Hot Dog", 50, "Chili Flavored Hot Dog"));
                productRepository.save(new Product("Vegan Hot Dog", 50, "Vegetarian Hot Dog"));

                productDetailsRepository.save(new ProductDetails(1, 20, null, null, 1,1));
                productDetailsRepository.save(new ProductDetails(2, 50, null, null, 1,2));
                productDetailsRepository.save(new ProductDetails(3, 0, "Red", null, 2,3));
                productDetailsRepository.save(new ProductDetails(null, null, null, FlavorType.CHILI, 3,4));
                productDetailsRepository.save(new ProductDetails(null, null, null, FlavorType.VEGETARIAN, 3,5));

//                Product product = new Product();
//                List<ProductDetails> productDetails = product.getProductDetails();
//                for (ProductDetails productDetailsAll : productDetails) {
//                    productDetailsAll.setProducts(product);
//                }
            };
        }
        return null;
    }
}
