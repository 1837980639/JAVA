package com.example.Sqltest.service.po;

import lombok.Data;

import java.util.Date;

//读书笔记的实体类

@Data
public class Article {
    private Integer id;
    private String title;
    private Date createTime;
    private Integer userArticleCatId;
    private String content;
    private Date updateTime;
    private Integer deleted;
    private Integer courseId;
    private Integer open;
}
