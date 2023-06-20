package com.example.demo.po;

import lombok.Data;

import java.util.Date;
@Data
public class User_role {
    private Integer id;
    private Integer user_id;
    private String role_ids;
    private Date create_time;
    private Date update_time;
}
