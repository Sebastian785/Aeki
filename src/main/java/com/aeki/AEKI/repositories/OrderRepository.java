package com.aeki.AEKI.repositories;

import com.aeki.AEKI.models.OrderList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderList, Integer> {
}

