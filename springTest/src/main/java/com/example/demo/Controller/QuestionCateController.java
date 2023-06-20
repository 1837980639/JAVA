package com.example.demo.Controller;


import com.example.demo.po.Permission;
import com.example.demo.po.Question;
import com.example.demo.po.QuestionCate;
import com.example.demo.service.PermissionService;
import com.example.demo.service.QuestionCateService;
import com.example.demo.service.QuestionService;
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
@Api(tags = "question-cate")
@RestController
@RequestMapping("/demo/question-cate")
public class QuestionCateController {
    @Autowired
    private QuestionCateService questionCateService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<QuestionCate> all(){
        return questionCateService.list();
    }
    @GetMapping("one")//article/one?id=1
    public QuestionCate one(Integer id){
        return questionCateService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody QuestionCate Interview){
        boolean flag=questionCateService.save(Interview);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody QuestionCate Interview){
        boolean flag=questionCateService.updateById(Interview);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return questionCateService.removeById(id);
    }
}
