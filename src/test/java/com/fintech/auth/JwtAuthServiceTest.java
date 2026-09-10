package com.fintech.auth;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class JwtAuthServiceTest {
    @Autowired
    private JwtAuthService jwtAuthService;

    @Test
    public void testGenerateToken() {
        String token = jwtAuthService.generateToken("testUser");
        assertNotNull(token);
        assertTrue(jwtAuthService.validateToken(token));
    }
}