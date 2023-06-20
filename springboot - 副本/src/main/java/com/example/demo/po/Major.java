package com.example.demo.po;

import lombok.Data;

import java.util.Date;

@Data
public class Major {
    private Integer id;
    private String major_name;
    private String major_desc;
    private Integer depart_id;
    private Date create_time;
    private Date update_time;
    private Integer deleted;
    private Integer school_id;
}
