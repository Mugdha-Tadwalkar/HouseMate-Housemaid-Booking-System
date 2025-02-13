package com.housemate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.housemate.model.HomeCategory;

public interface HomeCategoryRepository extends JpaRepository<HomeCategory,Long> {
}
