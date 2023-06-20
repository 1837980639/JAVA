package com.example.dao.impl;

import com.example.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public void save(){
        System.out.println("book dao save");
    }

    //生命周期
    public void init(){
        System.out.println("init..");
    }
    public void destroy(){
        System.out.println("destroy..");
    }
}
