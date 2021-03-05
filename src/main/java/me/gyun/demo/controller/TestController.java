package me.gyun.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String test() {
        return "test";
    }

    @GetMapping("/test")
    public String jenkinsTest() {
        return "jenkins";
    }

    @GetMapping("/test2")
    public String test2() {
        return "test2";
    }
}
