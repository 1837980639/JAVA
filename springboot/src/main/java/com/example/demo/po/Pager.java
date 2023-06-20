package com.example.demo.po;

import lombok.Data;

@Data
public class Pager {
    private Integer id;
    private String name;
    private String type;
    private Integer user_id;
    private String publication;
    private String publish_time;
    private String publication_cate;
    private Integer count;
    private String attachment;
}
