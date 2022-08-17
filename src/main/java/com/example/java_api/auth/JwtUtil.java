package com.example.java_api.auth;

import com.example.java_api.model.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Component
public class JwtUtil {
    @Value("${app.jwt.secret}")
    private String secret;

    public String generateAccessToken(User user) {
        return Jwts.builder()
                .setSubject(String.format("%s,%s", user.getId(), user.getEmail()))
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }
}
