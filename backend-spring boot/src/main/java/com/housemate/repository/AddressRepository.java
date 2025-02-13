package com.housemate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.housemate.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
