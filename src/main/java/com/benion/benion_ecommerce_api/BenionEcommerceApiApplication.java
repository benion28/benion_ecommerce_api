package com.benion.benion_ecommerce_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BenionEcommerceApiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BenionEcommerceApiApplication.class, args);
        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder();

    }

}
