package com.example.demo.po;

import lombok.Data;

import java.util.Date;

@Data
public class Competition_create {
    private Integer id;
    private Integer user_id;
    private String title;
    private String content;
    private Date start_time;
    private Date end_time;
    private Integer signup;
    private String target;
    private String type;
    private Date create_time;
    private Date update_time;
    private Integer deleted;
    private Integer aim_competition;
    private Integer state;
    private Integer checked;
    private Integer school_id;
}
