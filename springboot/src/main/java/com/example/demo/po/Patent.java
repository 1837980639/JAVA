package com.example.demo.po;

import lombok.Data;

import java.util.Date;
@Data
public class Patent {
    private Integer id;
    private String name;
    private Integer user_id;
    private String type;
    private Date empower_time;
    private String attachment;
}
