package com.benion.benion_ecommerce_api;

import org.springframework.stereotype.Component;

@Component
public class PaypalPaymentService implements PaymentService
{
    @Override
    public void processPayment(Double amount) {
        // Logic to process payment using PayPal API
        System.out.println("Amount: " + amount + " processed through PayPal.");
    }
}
