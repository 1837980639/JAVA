package com.example.demo.po;

import lombok.Data;

import java.util.Date;
@Data
public class User_article_cat {
    private Integer id;
    private Integer user_id;
    private Integer user_article_cat_ids;
    private Date create_time;
    private Date update_time;
    private Integer deleted;
}
