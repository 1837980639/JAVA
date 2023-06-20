package com.example.demo.po;

import lombok.Data;

import java.util.Date;

@Data
public class Memorabilia {
    private Integer id;
    private Integer user_id;
    private Date create_time;
    private String content;
    private Date update_time;
    private Date happen_time;
}
