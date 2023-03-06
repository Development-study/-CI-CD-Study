package com.study.cicd.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello Controller";
    }
    
    @GetMapping("/test")
    public String test() {
        return "Github WebHooks Test";
    }

    @GetMapping("/main-1-test")
    public String test1() {
        return "Github WebHooks Branch Test";
    }

}