package com.benion.benion_ecommerce_api.controllers;

import com.benion.benion_ecommerce_api.dtos.UserDto;
import com.benion.benion_ecommerce_api.entities.User;
import com.benion.benion_ecommerce_api.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;

//    @GetMapping
//    @GetMapping("")
//    public Iterable<User> getAllUsers() {
//        return userRepository.findAll();
//    }

    @GetMapping
    public Iterable<UserDto> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(user -> new UserDto(user.getId(), user.getName(), user.getEmail()))
                .toList();
    }

//    @GetMapping("/{id}")
//    public User getUser(@PathVariable Long id) {
//        return userRepository.findById(id).orElse(null);
//    }

//    @GetMapping("/{id}")
//    public ResponseEntity<User> getUser(@PathVariable Long id) {
//        var user = userRepository.findById(id).orElse(null);
//        if (user == null) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//            return ResponseEntity.notFound().build();
//        }
//        return new ResponseEntity<>(user, HttpStatus.ok);
//        return ResponseEntity.ok(user);
//    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable Long id) {
        var user = userRepository.findById(id).orElse(null);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }
        var userDto = new UserDto(user.getId(), user.getName(), user.getEmail());
        return ResponseEntity.ok(userDto);
    }
}
