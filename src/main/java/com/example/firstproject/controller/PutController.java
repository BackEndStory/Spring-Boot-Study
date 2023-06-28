package com.example.firstproject.controller;

import com.example.firstproject.dto.MemberDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PutController {
    @PutMapping(value = "/putmember")                                           // @PutMapping를 활용한 방법
    public String putMember(@RequestBody Map<String, String> putData){

        return putData.get("name");
    }

    @PutMapping(value = "/putmember2")
    public String putMember2(@RequestBody MemberDto memberDto){
        return memberDto.toString();
    }

    @PutMapping(value = "/putmember3")
    public MemberDto putMember3(@RequestBody MemberDto memberDto){
        return memberDto;
    }

    @PutMapping(value = "/putmember4")
    public ResponseEntity<MemberDto> putMember4(@RequestBody MemberDto memberDto){
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(memberDto);
    }



}
