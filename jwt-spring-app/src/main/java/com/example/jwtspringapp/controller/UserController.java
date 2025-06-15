package com.example.jwtspringapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jwtspringapp.repository.UserRepository;


import lombok.RequiredArgsConstructor;
import com.example.jwtspringapp.model.User;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/profile/{email}")
    public User getProfile(@PathVariable String email) {
        return userRepository.findByEmail(email).orElseThrow();
    }

    @PutMapping("/update/{email}")
    public String updateProfile(@PathVariable String email, @RequestBody User updatedUser) {
        User user = userRepository.findByEmail(email).orElseThrow();
        user.setName(updatedUser.getName());
        userRepository.save(user);
        return "User updated";
    }
}