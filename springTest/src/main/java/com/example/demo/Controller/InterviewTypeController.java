package com.example.demo.controller;


import com.example.demo.po.InterviewType;
import com.example.demo.service.InterviewTypeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 面试题类型 前端控制器
 * </p>
 *
 * @author 杨皓
 * @since 2022-10-14
 */
@Api(tags ="Interview_type")
@RestController
@RequestMapping("/demo/interview-type")
public class InterviewTypeController {
    @Autowired
    private InterviewTypeService iInterview_typeService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<InterviewType> all(){
        return iInterview_typeService.list();
    }
    @GetMapping("one")//article/one?id=1
    public InterviewType one(Integer id){
        return iInterview_typeService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody InterviewType Interview_type){
        boolean flag=iInterview_typeService.save(Interview_type);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody InterviewType Interview_type){
        boolean flag=iInterview_typeService.updateById(Interview_type);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return iInterview_typeService.removeById(id);
    }
}
