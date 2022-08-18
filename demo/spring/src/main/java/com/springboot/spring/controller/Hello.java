package com.springboot.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.spring.helloworld.helloWorld;

@RestController
public class Hello {
    private helloWorld hello = new helloWorld();

    @GetMapping("/hello")
    public String sayHello() {
        return hello.hello();
    }
}
