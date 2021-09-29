package com.rest.api.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    /*
    1. 화면에 helloworld가 출력
    */
    @GetMapping(value = "/helloworld/string")
    @ResponseBody
    public String helloworldString() {
        return "helloworld";
    }
    /*
    2. 화면에 {message:"helloworld"} 라고 출력
    */
    @GetMapping(value = "/helloworld/json")
    @ResponseBody
    public Hello helloworldJson() {
        Hello hello = new Hello();
        hello.message = "helloworld";
        return hello;
    }
    /*
    3. 화면에 helloworld.ftl의 내용이 출력
        ReapnseBody를 지정하지 않으면 Spring에서는 해당 결과를 표시해주기 위한 페이지를 찾는데
        해당 체이지가 없으면 404 에러 발생
    */
    @GetMapping(value = "/helloworld/page")
    public String helloworld() {
        return "helloworld";
    }

    @Setter
    @Getter
    public static class Hello {
        private String message;
    }
}