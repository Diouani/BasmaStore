package com.basmastore.orderservice.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Order {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int qts;
    private double price;

}
