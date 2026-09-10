package com.fintech.api;

import com.fintech.auth.JwtAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private JwtAuthService jwtAuthService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password) {
        // Aquí iría la lógica para validar las credenciales del usuario
        String token = jwtAuthService.generateToken(username);
        return ResponseEntity.ok(token);
    }

    @GetMapping("/protected")
    public ResponseEntity<String> protectedEndpoint() {
        return ResponseEntity.ok("Este es un endpoint protegido.");
    }
}