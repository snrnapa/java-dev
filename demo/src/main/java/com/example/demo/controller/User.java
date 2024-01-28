package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {

    @GetMapping("/")
    public void getUsers() {
        System.out.println("getUsersメソッドが呼び出されました。");
    }

}
