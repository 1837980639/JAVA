package com.example;

import org.apache.naming.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import  com.example.dao.BookDao;

public class appForBeanFactory {
    public static void main(String[] args) {
        Resource resource= new ClassPathResource("applicationContext.xml");
        XmlBeanFactory beanFactory= new XmlBeanFactory(resource);
        BookDao bookDao=beanFactory.getBean(BookDao.class);
        bookDao.save();
    }
}
