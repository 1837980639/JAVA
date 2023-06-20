package com.example.demo.controller;


import com.example.demo.po.InterviewRemark;
import com.example.demo.service.InterviewRemarkService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 杨皓
 * @since 2022-10-14
 */
@Api(tags ="Interview_remark")
@RestController
@RequestMapping("/demo/interview-remark")
public class InterviewRemarkController {
    @Autowired
    private InterviewRemarkService interview_remarkService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<InterviewRemark> all(){
        return interview_remarkService.list();
    }
    @GetMapping("one")//article/one?id=1
    public InterviewRemark one(Integer id){
        return interview_remarkService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody InterviewRemark Interview_remark){
        boolean flag=interview_remarkService.save(Interview_remark);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody InterviewRemark Interview_remark){
        boolean flag=interview_remarkService.updateById(Interview_remark);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return interview_remarkService.removeById(id);
    }
}
