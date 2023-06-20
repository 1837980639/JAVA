package com.example.demo.po;

import lombok.Data;

import java.util.Date;

@Data
public class Course {
    private Integer id;
    private String name;
    private String name_en;
    private String course_no;
    private String description;
    private Date create_time;
    private Date update_time;
    private String depart;
    private Integer state;
    private String major;
    private  Integer deleted;
    private String course_type;
    private String school;
}
