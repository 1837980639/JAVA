package com.example.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.example.annotation.Bookdao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JdbcConfig {
    @Value("com.mysql.jdbc.Driver")
    private  String driver;
    @Value("jdbc:mysql://localhost:3306/mybatis_demo")
    private  String url;
    @Value("root")
    private  String username;
    @Value("123456")
    private  String password;

    @Bean
    public DataSource dataSource(Bookdao bookdao){
        System.out.println(bookdao);
        DruidDataSource ds=new DruidDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/mybatis_demo");
        ds.setUsername("root");
        ds.setPassword("123456");
        return ds;
    }
}
