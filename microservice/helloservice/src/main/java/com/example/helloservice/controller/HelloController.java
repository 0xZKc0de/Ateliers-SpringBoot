package com.example.helloservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello() {
        return "Hello" + this.toString();
    }


    @GetMapping("other-hello")
    public String getMethodName() {
        return "Other Hello from HelloService";
    }
    
    
}
