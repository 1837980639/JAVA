package com.example.demo.Controller;

import com.example.demo.po.Article;
import com.example.demo.service.ArticleService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags ="article")
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Article> all(){
        return articleService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Article one(Integer id){
        return articleService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Article article){
        boolean flag=articleService.save(article);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Article article){
        boolean flag=articleService.updateById(article);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return articleService.removeById(id);
    }
}