package com.example.demo.po;

import lombok.Data;

import java.util.Date;
@Data
public class User_article {
    private Integer id;
    private Integer user_id;
    private Integer article_id;
    private Date create_time;
    private Date update_time;
    private Integer deleted;
}
