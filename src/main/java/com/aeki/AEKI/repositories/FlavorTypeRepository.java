package com.aeki.AEKI.repositories;

import com.aeki.AEKI.models.FlavorType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlavorTypeRepository extends JpaRepository<FlavorType, String> {
}

