package com.basmastore.orderservice.utilities;

import com.basmastore.orderservice.DTO.*;
import com.basmastore.orderservice.entity.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TransactionRequest {
    private Order order;
    private Payment payment;
}
