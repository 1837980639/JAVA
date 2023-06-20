package com.example.demo.po;

import lombok.Data;

@Data
public class Region {
    private Integer id;
    private String name;
    private Integer level;
    private Integer parent_id;
}
