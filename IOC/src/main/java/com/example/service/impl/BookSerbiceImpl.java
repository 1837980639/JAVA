package com.example.service.impl;

import com.example.dao.BookDao;
import com.example.dao.impl.BookDaoImpl;
import com.example.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookSerbiceImpl implements BookService, InitializingBean, DisposableBean {
    //删除new的形式
//    private BookDao bookDao=new BookDaoImpl();
    private BookDao bookDao;
    private int connnum;
    private String sqlname;
//    构造函数注入
    public BookSerbiceImpl(BookDao bookDao1, int connnum1, String sqlname1) {
        this.bookDao = bookDao1;
        this.connnum = connnum1;
        this.sqlname = sqlname1;
    }

//    通过setter来注入
    public void setConnnum(int connnum) {
        this.connnum = connnum;
    }

    public void setSqlname(String sqlname) {
        this.sqlname = sqlname;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
//    显示方法
    public void  save(){
        System.out.println("book service save .."+connnum+","+sqlname);
        bookDao.save();
    }


//    生命周期
    @Override
    public void destroy() throws Exception {
        System.out.println("service destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init");
    }
}
