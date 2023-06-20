package com.example.arr;

import com.example.array.impl.ArrayItem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ArrApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArrApplication.class, args);
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        ArrayItem arrItem = (ArrayItem) ctx.getBean("arrayItem");
        arrItem.toString();
    }
}
