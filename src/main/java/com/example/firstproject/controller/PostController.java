package com.example.firstproject.controller;


import com.example.firstproject.dto.MemberDto;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
    @ApiOperation(value = "POST 메서도 예제", notes = "@Reqeust Body을 활용한 POST Method")
    @ApiResponses({
            @ApiResponse(code = 200, message = "API 정상 작동"),
            @ApiResponse(code = 500, message = "서버 에러")}
    )
    public String postMemberDto(
            @ApiParam(value = "멤버 추가", required = true)  @RequestBody MemberDto memberDto
    ){
        return memberDto.toString();
    }

}
