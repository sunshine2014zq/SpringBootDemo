package com.sun.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping
public class DemoJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoJpaApplication.class, args);
    }

    @RequestMapping("/test")
    public String test(){
        return "HELLO WORD";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "Hello Word!!!";
    }

}

