package me.gyun.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by jg 2021/03/07 bb
 */
@RestController
public class TestController {

    @GetMapping("/lee")
    public String test() {
        return "TEst";
    }

    @GetMapping("/test")
    public String test2() {
        return "Gyunny!";
    }
}
