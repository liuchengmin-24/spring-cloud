package com.ajacom.cloud.sleuth.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @date 2018/1/11
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/hi")
    public String hi() {
        return "I'm ajacom";
    }
}
