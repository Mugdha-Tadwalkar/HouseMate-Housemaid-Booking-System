package com.housemate.repository;

import com.housemate.domain.AccountStatus;
import com.housemate.model.Seller;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SellerRepository extends JpaRepository<Seller,Long> {

    Seller findByEmail(String email);
    List<Seller> findByAccountStatus(AccountStatus status);
}
