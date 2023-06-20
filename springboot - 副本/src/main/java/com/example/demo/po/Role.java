package com.example.demo.po;

import lombok.Data;

import java.util.Date;
@Data
public class Role {
    private Integer id;
    private String role_name;
    private String description;
    private Integer status;
    private Date create_time;
    private Date update_time;
    private Integer deleted;
}
