package com.example.demo.po;

import lombok.Data;

import java.util.Date;

@Data
public class Competition_signup {
    private Integer id;
    private Integer student_id;
    private Integer competition_di;
    private Date create_time;
    private Integer checked;
}
