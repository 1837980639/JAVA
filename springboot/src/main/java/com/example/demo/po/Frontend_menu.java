package com.example.demo.po;

import lombok.Data;

@Data
public class Frontend_menu {
    private Integer id;
    private String menu_name;
    private String menu_url;
    private Integer pid;
    private Integer menu_sort;
    private String description;
    private Integer has_children;
}
