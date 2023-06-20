package com.example.demo.po;

import lombok.Data;

import java.util.Date;
@Data
public class Role_permission {
    private Integer id;
    private Integer role_id;
    private String permission_ids;
    private Date create_time;
    private Date update_time;
}
