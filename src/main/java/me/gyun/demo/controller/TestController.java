package me.gyun.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * created by jg 2021/03/07 ㅎ
 */
public class TestController {

    @GetMapping("/")
    public String test() {
        return "test";
    }ㅎ

    @GetMapping("test")
    public String test2() {
        return "Gyunny";
    }
}
