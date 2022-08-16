package com.springboot.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.spring.service.userService;

@RestController
public class User {
    private userService service = new userService();
    
    @GetMapping("/hello")
    public String hello() {
        return service.hello();
    }
}
