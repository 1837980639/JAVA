package com.example.annotation;

import com.example.config.SpringConfig;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class annService {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("annotation.xml");
//        ApplicationContext ctx= new AnnotationConfigApplicationContext(SpringConfig.class);
        Bookdao bookdao= (Bookdao) ctx.getBean(Bookdao.class);
        Bookdao bookdao2= (Bookdao) ctx.getBean(Bookdao.class);
        System.out.println(bookdao);
        System.out.println(bookdao2);
    }
}
