package com.benion.benion_ecommerce_api.controllers;

import com.benion.benion_ecommerce_api.entities.User;
import com.benion.benion_ecommerce_api.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {
    private final UserRepository userRepository;

    @GetMapping("/users")
    // method: GET,
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
