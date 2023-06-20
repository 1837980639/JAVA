package com.example.demo.po;

import lombok.Data;

import java.util.Date;

@Data
public class Copyright {
    private Integer id;
    private String name;
    private Integer user_id;
    private Date finish_time;
    private Date publish_time;
    private String attachment;
}
