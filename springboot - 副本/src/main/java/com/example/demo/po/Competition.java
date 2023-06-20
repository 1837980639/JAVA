package com.example.demo.po;

import lombok.Data;

@Data
public class Competition {
    private Integer id;
    private String name;
    private String content;
    private String home_page;
    private String type;
    private String rank;
    private Integer school_id;
    private String organizer;
    private String start;
    private String end;
}
