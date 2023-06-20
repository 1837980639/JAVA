package com.example.demo.Controller;



import com.example.demo.po.Article_cat;
import com.example.demo.service.Article_catService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags ="article_cat")
@RestController
@RequestMapping("/article_cat")
public class Article_catContreller {
    @Autowired
    private Article_catService Article_catService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Article_cat> all(){
        return Article_catService.list();
    }
    @GetMapping("/one")//article/one?id=1
    public Article_cat one(Integer id){
        return Article_catService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Article_cat Article_cat){
        boolean flag=Article_catService.save(Article_cat);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Article_cat article){
        boolean flag=Article_catService.updateById(article);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return Article_catService.removeById(id);
    }
}
