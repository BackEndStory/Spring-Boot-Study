package com.example.firstproject.controller;

import com.example.firstproject.dto.MemberDto;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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

    @GetMapping(value = "/request")              // Param 전송 방식
    @ApiOperation(value = "GET 메서도 예제", notes = "@Reqeust Param을 활용한 GET Method")
    @ApiResponses({
            @ApiResponse(code = 200, message = "API 정상 작동"),
            @ApiResponse(code = 500, message = "서버 에러")
    })
    public String getRequestParam(
            @ApiParam(value = "이름", required = true) @RequestParam String name,
            @ApiParam(value = "제목", required = true) @RequestParam String title,
            @ApiParam(value = "나이", required = true) @RequestParam int age
            ){
        return name +" " +title +" " +age;
    }

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