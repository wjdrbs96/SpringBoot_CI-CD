package me.gyun.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by jg 2021/03/07 bb
 */
@RestController
public class TestController {

    @GetMapping("/")
    public String test() {
        return "Docker를 이용해서 CI/CD 구축해보기 ㅎㅎ";
    }

    @GetMapping("/test")
    public String test2() {
        return "Gyunny!";
    }
}
