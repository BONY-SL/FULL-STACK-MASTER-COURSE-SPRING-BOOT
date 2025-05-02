package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping
public class UserController {

    @GetMapping("/user")
    public Map<String,Object> userInfo(){

        Map<String,Object> user = new HashMap<>();
        user.put("name","Namal");
        user.put("age",10);
        user.put("contact","0771981995");
        return user;
    }
}
