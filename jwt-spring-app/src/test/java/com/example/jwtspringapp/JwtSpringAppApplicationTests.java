package com.example.jwtspringapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = com.example.jwtspringapp.security.TestSecurityConfig.class)
class JwtSpringAppApplicationTests {

	@Test
	void contextLoads() {
	}

}
