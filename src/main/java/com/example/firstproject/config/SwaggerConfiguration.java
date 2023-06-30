package com.example.firstproject.config;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.firstproject"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot Open API Test with Swagger")
                .description("설명")
                .version("1.0.0")
                .build();
    }
//    @ApiOperation(value = "GET 메서도 예제", notes = "@Reqeust Param을 활용한 GET Method")
//    @ApiResponses({
//            @ApiResponse(code = 200, message = "API 정상 작동"),
//            @ApiResponse(code = 500, message = "서버 에러")
//    })
//    @GetMapping(value = "/request")
//    public String getRequestParam(
//            @ApiParam(value = "이름", required = true) @RequestParam String name,
//            @ApiParam(value = "제목", required = true) @RequestParam String title,
//            @ApiParam(value = "나이", required = true) @RequestParam int age
//    ){
//        return name +" " +title +" " +age;
//    }
}
