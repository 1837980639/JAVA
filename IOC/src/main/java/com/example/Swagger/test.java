package com.example.Swagger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
@SpringBootApplication
//@ComponentScan("com.example.Swagger.mapper")
public class test {
//    @Autowired
//    private
    public static void main(String[] args) {
        SpringApplication.run(test.class,args);
    }
    @GetMapping("id")
    public String index(){
        return "我搭建了一个服务器";
    }
}
