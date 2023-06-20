package com.example.demo.Controller;


import com.example.demo.po.Competition_signup;
import com.example.demo.service.Competition_signupService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api(tags ="Competition_signup")
@RestController
@RequestMapping("/Competition_signup")
public class Competition_signupConterller {
    @Autowired
    private Competition_signupService competition_signupService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Competition_signup> all(){
        return competition_signupService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Competition_signup one(Integer id){
        return competition_signupService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Competition_signup Competition_signup){
        boolean flag=competition_signupService.save(Competition_signup);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Competition_signup Competition_signup){
        boolean flag=competition_signupService.updateById(Competition_signup);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return competition_signupService.removeById(id);
    }
}
