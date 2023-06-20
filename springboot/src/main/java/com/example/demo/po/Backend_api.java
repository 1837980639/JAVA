package com.example.demo.po;

import lombok.Data;

@Data
public class Backend_api {
    private Integer id;
    private String api_name;
    private String api_url;
    private String api_method;
    private Integer pid;
    private Integer api_sort;
    private String description;
}