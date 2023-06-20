package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@RequestMapping
//@RestController
@SpringBootApplication
@ComponentScan("com.example.Sqltest.Mapper")
public class SqlService {
    public static void main(String[] args) {
        SpringApplication.run(SqlService.class,args);
    }
}
