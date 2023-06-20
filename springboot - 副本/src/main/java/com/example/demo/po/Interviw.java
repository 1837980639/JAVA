package com.example.demo.po;

import lombok.Data;

import java.util.Date;

@Data
public class Interviw {
    private Integer id;
    private String title;
    private String analysis;
    private Integer interview_type;
    private Date create_time;
    private Date update_time;
    private Integer deleted;
    private Integer userinfo_id;
}
