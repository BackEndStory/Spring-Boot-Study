package com.example.firstproject.controller;

import com.example.firstproject.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class GetController {
   // @RequestMapping(value = "/hello", method = RequestMethod.GET)  // 첫번째 방법
    //@GetMapping(value = "/name")                                    // 두번째 방법


  // @GetMapping(value = "/{test}")     // Query

//    public String getHello(@PathVariable String test){
//        return test;
//    }

//    @GetMapping(value = "/request")              // Param 전송 방식
//    public String getRequestParam(
//            @RequestParam String name,
//            @RequestParam String title,
//            @RequestParam int age
//            ){
//        return name +" " +title +" " +age;
//    }

//    @GetMapping(value = "/request2")                                          // 키 값 형태의 Param 전송방식
//    public String getRequestParam2(@RequestParam Map<String, String> param){
//        StringBuilder sb = new StringBuilder();
//        param.entrySet().forEach(map -> {
//            sb.append(map.getKey() +" : " +map.getValue() +"\n");
//        });
//        return sb.toString();
//    }

    @GetMapping(value = "/request3")              // Param 전송 방식
    public String getRequestParam3(
           MemberDto memberDto
            ){
        return memberDto.toString();
    }

}