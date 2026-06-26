package com.gen2soft.week14security.service;

import org.springframework.stereotype.Service;

@Service
public class JwtService {

    public String generateToken(String username) {
        return "jwt-token-for-" + username;
    }
}
