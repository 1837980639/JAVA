package com.example.demo.Controller;


import com.example.demo.po.UserArticle;
import com.example.demo.po.UserArticleCat;
import com.example.demo.service.UserArticleCatService;
import com.example.demo.service.UserArticleService;
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
@Api(tags = "user-article")
@RestController
@RequestMapping("/demo/user-article")
public class UserArticleController {
    @Autowired
    private UserArticleService userArticleService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<UserArticle> all(){
        return userArticleService.list();
    }
    @GetMapping("one")//article/one?id=1
    public UserArticle one(Integer id){
        return userArticleService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody UserArticle Interview){
        boolean flag=userArticleService.save(Interview);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody UserArticle Interview){
        boolean flag=userArticleService.updateById(Interview);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return userArticleService.removeById(id);
    }
}
