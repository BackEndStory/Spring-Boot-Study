package com.example.firstproject.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeleteController {
    @DeleteMapping(value = "/{variable}")                                // Variable을 이용한 삭제
    public String DeleteVariable1(@PathVariable String variable){
        return variable;
    }


    @DeleteMapping(value = "/request1")                                // Param을 이용한 삭제
    public String DeleteVariable2(@RequestParam String email){
        return "e-mail : " +email;
    }
}
