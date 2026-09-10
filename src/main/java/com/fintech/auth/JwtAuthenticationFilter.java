package com.fintech.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {
        String header = request.getHeader("Authorization");

        if (header!= null && header.startsWith("Bearer ")) {
            String token = header.substring(7);
            String username = jwtTokenUtil.getUsernameFromToken(token);
            if (username!= null && jwtTokenUtil.validateToken(token)) {
                // Aquí iría la lógica para autenticar al usuario y establecerlo en el contexto de seguridad
            }
        }

        chain.doFilter(request, response);
    }
}