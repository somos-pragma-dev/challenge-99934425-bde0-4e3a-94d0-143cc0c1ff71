package com.fintech.api;

import com.fintech.auth.JwtAuthService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
public class UserControllerTest {
    @Mock
    private JwtAuthService jwtAuthService;

    @InjectMocks
    private UserController userController;

    @Test
    public void testLogin() {
        when(jwtAuthService.generateToken("testUser")).thenReturn("testToken");
        ResponseEntity<String> response = userController.login("testUser", "testPassword");
        assertEquals("testToken", response.getBody());
    }
}