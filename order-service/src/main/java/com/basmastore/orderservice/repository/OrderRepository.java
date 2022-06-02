package com.basmastore.orderservice.repository;

import com.basmastore.orderservice.entity.*;
import org.springframework.data.jpa.repository.*;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
