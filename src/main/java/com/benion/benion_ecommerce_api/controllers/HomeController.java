package com.benion.benion_ecommerce_api.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Value("${spring.application.name}")
    private String appName;
    @RequestMapping("/test")
    public String test() {
        System.out.println("Welcome to Test: " + appName);
        return "test.html";
    }

    @RequestMapping("/")
    public String index(Model model) {
        String name = "Benion E-commerce API";
        model.addAttribute("name", name);
        System.out.println("Welcome to Home: " + name);
        return "index";
    }

    @RequestMapping("/hello")
    public String sayHello() {
        System.out.println("Welcome to Hello: " + appName);
        return "test.html";
    }
}
