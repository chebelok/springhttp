package com.example.demo1lab1http;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1Lab1httpController {
    @GetMapping("/")
    @ResponseBody
    String helloWorld(){
        return "Hello world ";
    }

    @GetMapping("/ivan")
    @ResponseBody
    public String ivanResp(){
        return "Lotokhin Ivan IM-13 group";
    }

}
