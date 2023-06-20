package com.example.demo.po;

import lombok.Data;

import java.util.Date;
@Data
public class Teacher {
    private Integer id;
    private Integer user_id;
    private String school;
    private String depart;
    private String tacher_no;
    private Date create_time;
    private Date update_time;
    private String professional;
    private String teacher_name;
}
