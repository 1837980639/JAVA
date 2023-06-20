package com.example.demo.Controller;


import com.example.demo.po.Competition_create;
import com.example.demo.service.Competition_createService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api(tags ="Competition_create")
@RestController
@RequestMapping("/Competition_create")
public class Competition_createConterller {
    @Autowired
    private Competition_createService competition_createService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Competition_create> all(){
        return competition_createService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Competition_create one(Integer id){
        return competition_createService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Competition_create Competition_create){
        boolean flag=competition_createService.save(Competition_create);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Competition_create Competition_create){
        boolean flag=competition_createService.updateById(Competition_create);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return competition_createService.removeById(id);
    }
}
