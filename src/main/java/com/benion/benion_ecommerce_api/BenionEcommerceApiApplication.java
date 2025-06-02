package com.benion.benion_ecommerce_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BenionEcommerceApiApplication {

    public static void main(String[] args) {
        var orderService = new OrderService(new PaypalPaymentService());
        // var orderService = new OrderService(new StripePaymentService());
        orderService.placeOrder();

//        SpringApplication.run(BenionEcommerceApiApplication.class, args);
    }

}
