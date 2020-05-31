package com.example.restservice;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String greet() {
        System.out.println("www");
        return "Hello, ";
    }
}
