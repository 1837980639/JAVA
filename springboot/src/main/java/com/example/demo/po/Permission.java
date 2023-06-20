package com.example.demo.po;

import lombok.Data;

import java.util.Date;
@Data
public class Permission {
    private Integer id;
    private String code;
    private String description;
    private String url;
    private String type;
    private Integer deleted;
    private Date create_time;
    private Date update_time;
    private Integer pid;
    private Integer hax_children;
}
