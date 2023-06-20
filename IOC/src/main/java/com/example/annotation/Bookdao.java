package com.example.annotation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component("BOOK")
@Repository
public class Bookdao {
    public void save(){
        System.out.println("book dao save ...");
    }
}
