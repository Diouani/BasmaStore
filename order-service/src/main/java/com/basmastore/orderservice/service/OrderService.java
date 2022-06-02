package com.basmastore.orderservice.service;


import com.basmastore.orderservice.DTO.*;
import com.basmastore.orderservice.entity.*;
import com.basmastore.orderservice.repository.*;
import com.basmastore.orderservice.utilities.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.client.*;

@Service
public class OrderService {
    private final OrderRepository orderRepository;


    private final RestTemplate template;


    public OrderService(OrderRepository orderRepository, RestTemplate template) {
        this.orderRepository = orderRepository;
        this.template = template;
    }

    public TransactionResponse saveOrder(TransactionRequest request) {
        Order order = request.getOrder();

        Payment payment = request.getPayment();

        payment.setOrderId(order.getId());


        payment.setAmount(order.getPrice());

        //REST CALL TO PAYMENT SERVICE

       Payment paymentResponse =  template.postForObject("http://PAYMENT-SERVICE/payment/doPayment", payment, Payment.class);


        assert paymentResponse != null;
        String response = paymentResponse.getPaymentStatus().equals("success") ? "payment success" : "payment failed";

      orderRepository.save(order);
        return new TransactionResponse(order , paymentResponse.getAmount(), paymentResponse.getTransactionId(), response);


    }

    public Order findById(Long id) {
        return orderRepository.findById(id).get();
    }
}
