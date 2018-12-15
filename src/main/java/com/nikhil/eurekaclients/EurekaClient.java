package com.nikhil.eurekaclients;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClient {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello to the UserL̥ from EurekaClient!";
    }
}
