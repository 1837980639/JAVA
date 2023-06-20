package com.example.demo.po;

import lombok.Data;

@Data
public class Dormitory {
    private Integer id;
    private String name;
    private Integer leader;
    private Integer max_number;
    private Integer left_number;
    private Integer live_number;
    private String status;
    private String comment;
    private String school;
    private Integer type;
    private String building;
}
