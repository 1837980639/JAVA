package com.example.demo.Controller;


import com.example.demo.po.Teacher;
import com.example.demo.po.UserArticleCat;
import com.example.demo.service.TeacherService;
import com.example.demo.service.UserArticleCatService;
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
@Api(tags = "user-article-cat")
@RestController
@RequestMapping("/demo/user-article-cat")
public class UserArticleCatController {
    @Autowired
    private UserArticleCatService userArticleCatService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<UserArticleCat> all(){
        return userArticleCatService.list();
    }
    @GetMapping("one")//article/one?id=1
    public UserArticleCat one(Integer id){
        return userArticleCatService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody UserArticleCat Interview){
        boolean flag=userArticleCatService.save(Interview);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody UserArticleCat Interview){
        boolean flag=userArticleCatService.updateById(Interview);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return userArticleCatService.removeById(id);
    }
}
