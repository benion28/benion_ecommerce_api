package com.benion.benion_ecommerce_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// @Service or @Component annotation can be used
@Component
public class OrderService {
    private PaymentService paymentService;
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

//    public OrderService() {
//        // Default constructor
//    }

    // Constructor injection -- @Autowired is optional if there's only one constructor
//    @Autowired
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    public void placeOrder() {
        // Logic to place an order
        paymentService.processPayment(30.00); // Example amount
        // System.out.println("Order placed with details: " + orderDetails);
    }
}
