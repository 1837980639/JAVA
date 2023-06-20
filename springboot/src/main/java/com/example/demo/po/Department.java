package com.example.demo.po;

import lombok.Data;

import java.util.Date;

@Data
public class Department {
    private Integer id;
    private String depart_name;
    private String depart_code;
    private String depart_desc;
    private Integer school_id;
    private Date create_time;
    private Date update_time;
    private String depart_type;
    private Integer deleted;
}
