package com.example.demo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start")
public class Demo1Controller {

    @RequestMapping("/springBoot")
    public String startSpringBoot() {
        return "Welcome to the world of Spring Boot！";
    }
}
