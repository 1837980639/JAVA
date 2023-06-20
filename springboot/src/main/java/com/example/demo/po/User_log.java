package com.example.demo.po;

import lombok.Data;

import java.util.Date;
@Data
public class User_log {
    private Integer id;
    private Integer user_id;
    private String log;
    private Date create_time;
}
