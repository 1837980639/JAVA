package com.example.demo.po;


import lombok.Data;

import java.util.Date;

@Data
public class Article_cat {
    private Integer id;
    private String cat_name;
    private Integer parent_id;
    private Integer show_in_nav;
    private Integer sort_order;
    private Date create_time;
    private Date update_time;
    private Integer deleted;
}
