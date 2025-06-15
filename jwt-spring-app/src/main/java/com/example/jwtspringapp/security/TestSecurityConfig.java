package com.example.jwtspringapp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@Profile("test")
public class TestSecurityConfig {

    @Bean
    public PasswordEncoder TestPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}