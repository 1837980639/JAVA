package com.example.demo.po;

import lombok.Data;

import java.util.Date;

@Data
public class Community {
    private Integer id;
    private String name;
    private Integer type;
    private String teachers;
    private String logo;
    private Integer charger;
    private String description;
    private Integer status;
    private String address;
    private String mobile;
    private String email;
    private String weixin;
    private Integer school_id;
    private Date create_time;
    private Date update_time;
    private Integer version;
    private Integer deleted;
}
