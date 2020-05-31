package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingServiceController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    private final GreetingService service;

    public GreetingServiceController(GreetingService service) {

        this.service = service;
    }



    @RequestMapping("/greeting-svc")
    public String greeting2(@RequestParam(value = "name", defaultValue = "World") String name) {
        System.out.println("aa");
        return service.greet() + " " + name + "!";
    }
}