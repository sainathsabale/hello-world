package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/getName")
    public String getName(){
        return "";
    }

    @GetMapping("/getCity")
    public String getCity(){
        return "";
    }

}
