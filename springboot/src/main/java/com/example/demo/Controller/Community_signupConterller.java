package com.example.demo.Controller;


import com.example.demo.po.Community_signup;
import com.example.demo.service.Community_signupService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api(tags ="Community_signup")
@RestController
@RequestMapping("/Community_signup")
public class Community_signupConterller {
    @Autowired
    private Community_signupService community_signupService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Community_signup> all(){
        return community_signupService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Community_signup one(Integer id){
        return community_signupService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Community_signup Community_signup){
        boolean flag=community_signupService.save(Community_signup);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Community_signup Community_signup){
        boolean flag=community_signupService.updateById(Community_signup);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return community_signupService.removeById(id);
    }
}
