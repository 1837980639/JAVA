package com.example.demo.Controller;


import com.example.demo.po.Interview_remark;
import com.example.demo.service.Interview_remarkService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api(tags ="Interview_remark")
@RestController
@RequestMapping("/Interview_remark")
public class Interview_remarkController {
    @Autowired
    private Interview_remarkService interview_remarkService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Interview_remark> all(){
        return interview_remarkService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Interview_remark one(Integer id){
        return interview_remarkService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Interview_remark Interview_remark){
        boolean flag=interview_remarkService.save(Interview_remark);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Interview_remark Interview_remark){
        boolean flag=interview_remarkService.updateById(Interview_remark);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return interview_remarkService.removeById(id);
    }
}
