package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    URI?

 */

@RestController // annotation 이 클래스는 rest api를 처리하는 컨트롤러
@RequestMapping("/api") // localhost:8080/api/ 주소를 사용할거다.
public class ApiController {
    @GetMapping("hello")
    public String hello() {
        return "Hello Java";
    }
}
