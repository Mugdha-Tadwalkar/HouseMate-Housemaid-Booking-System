package com.housemate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.housemate.model.PaymentOrder;

public interface PaymentOrderRepository extends JpaRepository<PaymentOrder,Long> {

    PaymentOrder findByPaymentLinkId(String paymentId);
}
