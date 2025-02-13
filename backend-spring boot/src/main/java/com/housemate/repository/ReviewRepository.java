package com.housemate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.housemate.model.Product;
import com.housemate.model.Review;
import com.housemate.model.User;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review,Long> {
    List<Review> findReviewsByUserId(Long userId);
    List<Review> findReviewsByProductId(Long productId);
}
