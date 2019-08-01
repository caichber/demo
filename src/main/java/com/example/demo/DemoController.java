package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {



    @RequestMapping("/")
    public String hello() {
        String javaVersion = System.getProperty("java.version");
        return javaVersion != null ? "Hello! JavaVersion: " + javaVersion : "Hello!";
    }
}
