package com.example;

import com.example.array.Arr;
import com.example.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
    public static void main(String[] args) {
        //获取Ioc容器
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        ctx.registerShutdownHook();
        //获取bean
        BookDao bookDao=(BookDao) ctx.getBean("bookDao");
        bookDao.save();
        Arr arrayItem= (Arr) ctx.getBean("arrayItem");
        arrayItem.toString();
        //常规分配
            //BookService bookSerbice = (BookService) ctx.getBean("bookSerbice");
            //bookSerbice.save();

        //自动分配
            //Bookserviceauto bookserviceauto = (Bookserviceauto) ctx.getBean("bookserviceauto");
            //bookserviceauto.save();

        //销毁容器
        //ctx.close();
    }
}
