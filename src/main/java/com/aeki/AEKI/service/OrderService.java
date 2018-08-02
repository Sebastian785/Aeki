package com.aeki.AEKI.service;

import com.aeki.AEKI.exception.NotFoundException;
import com.aeki.AEKI.models.*;
import com.aeki.AEKI.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrdersProductsRepository ordersProductsRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductCategoriesRepository productCategoriesRepository;

    @Autowired
    private ProductDetailsRepository productDetailsRepository;

    public Orders createOrder(OrderRequest orderRequest) {
        Orders orderResponse = new Orders();
        orderResponse.setCustomerId(orderRequest.getCustomerId());
        orderResponse.setName(orderRequest.getName());
        List<OrdersProducts> ordersProducts = new ArrayList<>();
        Double total = 0.0;

        //get customer


        Customer customer = customerRepository.findById(orderRequest.getCustomerId()).orElseThrow(() -> new NotFoundException(orderRequest.getCustomerId().toString()));
        List<Membership> memberships = customer.getMemberships();

        for (ProductRequest productRequest : orderRequest.getProducts()) {
            OrdersProducts orderProduct = new OrdersProducts();
            Product product = productRepository.findById(productRequest.getProductId()).orElseThrow(() -> new NotFoundException(productRequest.getProductId().toString()));
            ProductCategories productCategories = productCategoriesRepository.findById(product.getProductCategoryID()).orElseThrow(() -> new NotFoundException(product.getProductCategoryID().toString()));

            Boolean isDiscount = false;
            if (memberships != null) {
                for (Membership membership : memberships) {
                    if (membership.getProductCategoryID() == product.getProductCategoryID()) {
                        isDiscount = true;
                    }
                }
            }
            if (isDiscount) {

                orderProduct.setDiscountPrice(product.getPrice() - (product.getPrice() * (productCategories.getDiscountPercent()) / 100));

                orderProduct.setAmount(productRequest.getAmount());
                orderProduct.setOriginalPrice(product.getPrice());
                total += productRequest.getAmount() * orderProduct.getDiscountPrice();
            } else {
                orderProduct.setAmount(productRequest.getAmount());
                orderProduct.setOriginalPrice(product.getPrice());
                total += productRequest.getAmount() * product.getPrice();
            }

            orderProduct.setProductName(product.getProductName());
            orderProduct.setOrders(orderResponse);
            ordersProducts.add(orderProduct);
        }

        orderResponse.setOrdersProductsList(ordersProducts);
        orderResponse.setTotalPrice(total);

        return orderRepository.save(orderResponse);
    }


}
