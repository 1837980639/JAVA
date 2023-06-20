package com.example.service.impl;

import com.example.dao.BookDao;
import com.example.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bookserviceauto implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    //    显示方法
    public void  save(){
        System.out.println("book service auto save ..");
        bookDao.save();
    }
}
