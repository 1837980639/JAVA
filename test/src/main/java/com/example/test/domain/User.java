package com.example.test.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Data
@Builder
@TableName(value = "user")
public class User {
    private Integer id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;
}
