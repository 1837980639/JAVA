package com.example.demo.po;

import lombok.Data;

import java.util.Date;

@Data
public class Community_signup {
    private Integer id;
    private Integer student_id;
    private Integer community_id;
    private Date create_time;
    private Integer checked;
}
