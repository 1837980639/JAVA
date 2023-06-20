package com.example.Sqltest.Cotroller;

import com.example.Sqltest.service.po.Article;
import com.example.Sqltest.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")//窄化请求
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/all")
    public List<Article> all(){
        return articleService.list();
    }
    @GetMapping("/one")
    public  Article one(Integer id){
        //简单数据传值
        return  articleService.getById(id);
    }
    @PostMapping("/add")
    public boolean add(@RequestBody Article article){
        //po传值
        boolean flag=articleService.save(article);
        return  flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Article article){
        boolean flag=articleService.updateById(article);
        return  flag;
    }
    @GetMapping ("/delete")
    public boolean delete(Integer id){
        boolean flag=articleService.removeById(id);
        return  flag;
    }
}
