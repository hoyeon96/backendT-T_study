package com.example.hello.controller;

import com.example.hello.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {
    @PutMapping("/put/{para}")
    public void put(@PathVariable String para , @RequestBody PostRequestDto postDto){
        System.out.println("업데이트할 놈은 : " + para);
        System.out.println(postDto.toString());

    }
}
