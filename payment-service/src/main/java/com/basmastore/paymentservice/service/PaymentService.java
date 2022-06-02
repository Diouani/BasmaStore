package com.basmastore.paymentservice.service;

import com.basmastore.paymentservice.entity.*;
import com.basmastore.paymentservice.repository.*;
import org.springframework.stereotype.*;

import java.util.*;


@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    public Payment doPayment(Payment payment) {
        payment.setPaymentStatus(paymentProcessing());
        payment.setTransactionId(UUID.randomUUID().toString());
        return paymentRepository.save(payment);
    }

    public String paymentProcessing(){

        System.out.println(new Random().nextBoolean());
        String paymentStatus = new Random().nextBoolean()?"success":"false";

        System.out.println(paymentStatus);
        return paymentStatus;
    }

    public Payment findPaymentHistoryByOrderId(int orderId) {

        return paymentRepository.findByOrderId(orderId);
    }
}

