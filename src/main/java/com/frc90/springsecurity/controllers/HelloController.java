package com.frc90.springsecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greeting")
public class HelloController {

    @GetMapping("/sayHelloWorldPublic")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/helloWorldProtected")
    public String sayHelloProtected(){
        return "Hello World protected";
    }
}
