package com.example.demo.po;

import lombok.Data;
import java.util.Date;

@Data
public class Article {
    private Integer id;
    private Integer user_article_cat_id;
    private String title;
    private String content;
    private Date update_time;
    private Date create_time;
    private Integer deleted;
    private Integer course_id;
    private Integer open;
}
