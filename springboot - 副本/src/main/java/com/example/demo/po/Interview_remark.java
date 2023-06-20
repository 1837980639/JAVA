package com.example.demo.po;

import lombok.Data;

import java.util.Date;

@Data
public class Interview_remark {
    private Integer id;
    private String content;
    private Integer Interview_id;
    private Date create_time;
}
