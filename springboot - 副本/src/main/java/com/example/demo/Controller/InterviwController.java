package com.example.demo.Controller;


import com.example.demo.po.Interviw;
import com.example.demo.service.InterviwService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api(tags ="Interviw")
@RestController
@RequestMapping("/Interviw")
public class InterviwController {
    @Autowired
    private InterviwService iInterviwService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Interviw> all(){
        return iInterviwService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Interviw one(Integer id){
        return iInterviwService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Interviw Interviw){
        boolean flag=iInterviwService.save(Interviw);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Interviw Interviw){
        boolean flag=iInterviwService.updateById(Interviw);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return iInterviwService.removeById(id);
    }
}
