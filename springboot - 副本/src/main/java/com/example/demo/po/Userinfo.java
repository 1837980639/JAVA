package com.example.demo.po;

import lombok.Data;

import java.util.Date;
@Data
public class Userinfo {
    private Integer id;
    private String user_name;
    private String password;
    private String user_type;
    private Date create_time;
    private Date update_time;
    private Integer deleted;
    private Integer state;
    private String token;
    private Integer binding;
}
