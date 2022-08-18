package com.springboot.spring.helloworld;

import org.springframework.stereotype.Controller;

@Controller
public class helloWorld {
    public String hello() {
        return "Hello Spring Boot!";
    }
}
