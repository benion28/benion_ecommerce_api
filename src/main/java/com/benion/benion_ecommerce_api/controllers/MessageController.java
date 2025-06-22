package com.benion.benion_ecommerce_api.controllers;

import com.benion.benion_ecommerce_api.entities.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @RequestMapping("/greet")
    public Message greeting() {
        return new Message("Greetings From Here");
    }
}
