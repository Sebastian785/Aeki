package com.aeki.AEKI.repositories;

import com.aeki.AEKI.models.OrdersProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersProductsRepository extends JpaRepository<OrdersProducts, Integer> {
}
