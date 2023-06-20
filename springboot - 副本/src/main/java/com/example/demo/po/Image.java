package com.example.demo.po;

import lombok.Data;

import java.util.Date;

@Data
public class Image {
    private Integer id;
    private String img_url;
    private String name;
    private Date create_time;
    private Date update_time;
    private Integer width;
    private Integer height;
}
