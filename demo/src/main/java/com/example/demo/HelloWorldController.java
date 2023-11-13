package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HelloWorldController {
    @GetMapping(value="hello")
    public String getHelloWorld() {
        return "Hello SpringOne Ruchika has a cooler demo!";
    }
    
}
