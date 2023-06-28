package com.example.firstproject.controller;


import com.example.firstproject.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
//@RequestMapping(value = "/api/post-api", method = RequestMethod.POST)                 // RequestMapping 사용 예시
@RequestMapping("/api")
public class PostController {

//    @PostMapping(value = "/data")                                                    // PostMapping 사용 예시
//    public String Post(@RequestBody Map<String, String> postData){
////        StringBuilder sb = new StringBuilder();
////        postData.entrySet().forEach(map ->{
////            sb.append(map.getKey() +map.getValue());
////        });
//        return postData.get("name");
//    }

    @PostMapping(value = "/dataModel")
    public String postMemberDto(@RequestBody MemberDto memberDto){
        return memberDto.toString();
    }

}
