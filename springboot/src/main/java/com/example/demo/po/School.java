package com.example.demo.po;

import lombok.Data;

import java.util.Date;
@Data
public class School {
    private Integer id;
    private String province;
    private String city;
    private String area;
    private String school_name;
    private String latitude;
    private String longitude;
    private Integer enable;
    private String description;
    private String address;
    private Date create_time;
    private Date update_time;
    private Integer deleted;
}
