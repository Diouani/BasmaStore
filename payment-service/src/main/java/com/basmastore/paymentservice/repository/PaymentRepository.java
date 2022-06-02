package com.basmastore.paymentservice.repository;

import com.basmastore.paymentservice.entity.*;
import org.springframework.data.jpa.repository.*;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Payment findByOrderId(int orderId);
}
