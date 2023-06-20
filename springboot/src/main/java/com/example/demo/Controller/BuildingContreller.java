package com.example.demo.Controller;


import com.example.demo.po.Building;
import com.example.demo.service.BuildingService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api(tags ="Building")
@RestController
@RequestMapping("/Building")
public class BuildingContreller {
    @Autowired
    private BuildingService buildingService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Building> all(){
        return buildingService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Building one(Integer id){
        return buildingService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Building Building){
        boolean flag=buildingService.save(Building);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Building Building){
        boolean flag=buildingService.updateById(Building);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return buildingService.removeById(id);
    }
}
