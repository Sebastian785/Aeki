package com.aeki.AEKI.repositories;

import com.aeki.AEKI.models.ProductCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoriesRepository extends JpaRepository<ProductCategories, String> {
}

