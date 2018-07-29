package com.aeki.AEKI.repositories;

import com.aeki.AEKI.models.Membership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembershipRepository extends JpaRepository<Membership, String> {
}

