package com.example.demo.controller;


import com.example.demo.po.Question;
import com.example.demo.service.QuestionService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 试题 前端控制器
 * </p>
 *
 * @author 杨皓
 * @since 2022-10-14
 */
@Api(tags = "question")
@RestController
@CrossOrigin
@RequestMapping("/demo/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Question> all(){
        return questionService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Question one(Integer id){
        return questionService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Question Interview){
        boolean flag=questionService.save(Interview);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Question Interview){
        boolean flag=questionService.updateById(Interview);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return questionService.removeById(id);
    }
}
