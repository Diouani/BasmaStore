package com.basmastore.paymentservice.entity;


import lombok.*;


import javax.persistence.*;

@Entity
@Table(name = "payment")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;
    private String paymentStatus;
   private String transactionId;
   private int orderId;
   private double amount;

}
