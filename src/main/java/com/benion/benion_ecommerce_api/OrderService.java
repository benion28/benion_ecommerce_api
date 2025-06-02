package com.benion.benion_ecommerce_api;

public class OrderService {
    public void placeOrder(String orderDetails) {
        // Logic to place an order
        var paymentService = new StripePaymentService();
        paymentService.processPayment(30.00); // Example amount
        // System.out.println("Order placed with details: " + orderDetails);
    }
}
