package com.benion.benion_ecommerce_api;

public class OrderService {
    private PaymentService paymentService;
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    public void placeOrder() {
        // Logic to place an order
        paymentService.processPayment(30.00); // Example amount
        // System.out.println("Order placed with details: " + orderDetails);
    }
}
