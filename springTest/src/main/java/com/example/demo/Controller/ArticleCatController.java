package com.example.demo.Controller;


import com.example.demo.po.ArticleCat;
import com.example.demo.service.ArticleCatService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
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
@Api(tags ="ArticleCat")
@RestController
@CrossOrigin
@RequestMapping("/demo/article-cat")
public class ArticleCatController {
    @Autowired
    private ArticleCatService Article_catService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<ArticleCat> all(){
        return Article_catService.list();
    }
    @GetMapping("/one")//article/one?id=1
    public ArticleCat one(Integer id){
        return Article_catService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody ArticleCat Article_cat){
        boolean flag=Article_catService.save(Article_cat);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody ArticleCat article){
        boolean flag=Article_catService.updateById(article);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return Article_catService.removeById(id);
    }
}
