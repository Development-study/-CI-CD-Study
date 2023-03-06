package com.study.cicd.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello";
    }
    
    @GetMapping("/test")
    public String test() {
        return "Test";
    }

}