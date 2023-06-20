package com.example.demo.controller;


import com.example.demo.po.Interview;
import com.example.demo.service.InterviewService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 面试题 前端控制器
 * </p>
 *
 * @author 杨皓
 * @since 2022-10-14
 */
@Api(tags ="Interviw")
@RestController
@RequestMapping("/demo/interview")
public class InterviewController {
    @Autowired
    private InterviewService iInterviwService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Interview> all(){
        return iInterviwService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Interview one(Integer id){
        return iInterviwService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Interview Interviw){
        boolean flag=iInterviwService.save(Interviw);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Interview Interviw){
        boolean flag=iInterviwService.updateById(Interviw);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return iInterviwService.removeById(id);
    }
}
