package me.gyun.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by jg 2021/03/07
 */
@RestController
public class TestController {

    @GetMapping("/")
    public String test() {
        return "로드 밸런서";
    }
}
