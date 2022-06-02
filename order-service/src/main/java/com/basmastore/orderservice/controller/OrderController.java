package com.basmastore.orderservice.controller;

import com.basmastore.orderservice.DTO.*;
import com.basmastore.orderservice.entity.*;
import com.basmastore.orderservice.service.*;
import com.basmastore.orderservice.utilities.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;


    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    @PostMapping("/bookOrder")
    public TransactionResponse bookOrder(@RequestBody TransactionRequest request) {



        return orderService.saveOrder(request);
    }
}


