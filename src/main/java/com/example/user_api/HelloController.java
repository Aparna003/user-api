package com.example.user_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String Hello(){
           return "Hello World from Spring Boot";
    }
    @GetMapping("/health")
    public String health(){
        return "Application is running";
    }


}
