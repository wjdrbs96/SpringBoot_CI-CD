package me.gyun.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by jg 2021/03/07
 */
@RestController
public class TestController {

    @GetMapping("/")
    public String gyunny() {
        return "타겟그룹 A !!!";
    }

    @GetMapping("/test")
    public String test() {
        return "타겟그룹 B !!!";
    }

    // 테스트
}
