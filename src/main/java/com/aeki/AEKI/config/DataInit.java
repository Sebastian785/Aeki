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

    public Product addProductList(Product product, ProductDetails productDetails) {
        Product products = product;
        ProductDetails productsDetails = productDetails;
        product.setProductDetails(productDetails);
        productDetails.setProduct(product);
        return product;
    }

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


                List<Product> productList = new ArrayList<>();
                productList.add(
                        addProductList(new Product("Carpet", "Small Carpet", 30),
                                new ProductDetails(1, 20, null, null, 1))
                );
                productList.add(
                        addProductList(new Product("Wardrobe", "Cool Wardrobe", 50),
                                new ProductDetails(2, 50, null, null, 1))
                );
                productList.add(
                        addProductList(new Product("Rug", "Magic Rug", 50),
                                new ProductDetails(3, 0, "Red", null, 2))
                );
                productList.add(
                        addProductList(new Product("Hot Dog", "Chili Flavored Hot Dog", 50),
                                new ProductDetails(null, null, null, FlavorType.CHILI, 3))
                );
                productList.add(
                        addProductList(new Product("Vegan Hot Dog", "Vegetarian Hot Dog", 50),
                                new ProductDetails(null, null, null, FlavorType.VEGETARIAN, 3))
                );


//                Product product = new Product();
//                ProductDetails productDetails = new ProductDetails();
//
//                product = new Product("Carpet", "Small Carpet", 30);
//                productDetails = new ProductDetails(1, 20, null, null, 1);
//                product.setProductDetails(productDetails);
//                productDetails.setProduct(product);
//                productList.add(product);
//
//                product = new Product("Wardrobe", "Cool Wardrobe", 50);
//                productDetails = new ProductDetails(2, 50, null, null, 1);
//                product.setProductDetails(productDetails);
//                productDetails.setProduct(product);
//                productList.add(product);
//
//                product = new Product("Rug", "Magic Rug", 50);
//                productDetails = new ProductDetails(3, 0, "Red", null, 2);
//                product.setProductDetails(productDetails);
//                productDetails.setProduct(product);
//                productList.add(product);
//
//                product = new Product("Hot Dog", "Chili Flavored Hot Dog", 50);
//                productDetails = new ProductDetails(null, null, null, FlavorType.CHILI, 3);
//                product.setProductDetails(productDetails);
//                productDetails.setProduct(product);
//                productList.add(product);
//
//                product = new Product("Vegan Hot Dog", "Vegetarian Hot Dog", 50);
//                productDetails = new ProductDetails(null, null, null, FlavorType.VEGETARIAN, 3);
//                product.setProductDetails(productDetails);
//                productDetails.setProduct(product);
//                productList.add();

                productRepository.saveAll(productList);


//                productRepository.save(new Product("Carpet", 30, "Small Carpet",
//                        (new ProductDetails(1, 20, null, null, 1))));
//                productRepository.save(new Product("Wardrobe", 50, "Cool Wardrobe",null));
//                productRepository.save(new Product("Rug", 50, "Magic Rug"));
//                productRepository.save(new Product("Hot Dog", 50, "Chili Flavored Hot Dog"));
//                productRepository.save(new Product("Vegan Hot Dog", 50, "Vegetarian Hot Dog"));

//                productDetailsRepository.save(new ProductDetails(1, 20, null, null, 1));
//                productDetailsRepository.save(new ProductDetails(2, 50, null, null, 1,2));
//                productDetailsRepository.save(new ProductDetails(3, 0, "Red", null, 2,3));
//                productDetailsRepository.save(new ProductDetails(null, null, null, FlavorType.CHILI, 3,4));
//                productDetailsRepository.save(new ProductDetails(null, null, null, FlavorType.VEGETARIAN, 3,5));

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
