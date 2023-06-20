package com.example;

import com.example.array.impl.ArrayItem;
import com.example.array.test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class app {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        test test = (com.example.array.test) ctx.getBean("test");
        test.save();
        ArrayItem arrItem = (ArrayItem) ctx.getBean("arrayItem");
        arrItem.save();
    }
}