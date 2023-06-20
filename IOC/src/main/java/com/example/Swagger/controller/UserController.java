package com.example.Swagger.controller;

import com.example.Swagger.entity.User;
import com.example.Swagger.mapper.UserMapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserController {

    @Resource
    private UserMapper userMapper;

    @GetMapping("ids")
    public List<User> findall(){
        return  userMapper.findAll();
    }
}
