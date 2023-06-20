package com.example.demo.po;

import lombok.Data;

import java.util.Date;
@Data
public class Student {
    private Integer id;
    private Integer user_id;
    private String school;
    private String depart;
    private String classinfo;
    private String student_no;
    private Date create_time;
    private Date update_time;
    private String major;
    private String student_name;
}
