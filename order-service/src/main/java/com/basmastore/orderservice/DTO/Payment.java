package com.basmastore.orderservice.DTO;


import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Payment {


    private Long paymentId;
    private String paymentStatus;
    private String transactionId;
    private long orderId;
    private double amount;

}
