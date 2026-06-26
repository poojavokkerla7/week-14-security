package com.gen2soft.week14security.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/login")
    public String login() {
        return "Week 14 Security - Login API Working";
    }

    @GetMapping("/test")
    public String test() {
        return "Protected API (after security)";
    }
}
