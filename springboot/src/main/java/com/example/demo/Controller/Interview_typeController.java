package com.example.demo.Controller;


import com.example.demo.po.Interview_type;
import com.example.demo.service.Interview_typeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api(tags ="Interview_type")
@RestController
@RequestMapping("/Interview_type")
public class Interview_typeController {
    @Autowired
    private Interview_typeService iInterview_typeService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Interview_type> all(){
        return iInterview_typeService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Interview_type one(Integer id){
        return iInterview_typeService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Interview_type Interview_type){
        boolean flag=iInterview_typeService.save(Interview_type);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Interview_type Interview_type){
        boolean flag=iInterview_typeService.updateById(Interview_type);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return iInterview_typeService.removeById(id);
    }
}
