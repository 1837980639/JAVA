package com.example.demo.Controller;


import com.example.demo.po.UserArticle;
import com.example.demo.po.UserCourse;
import com.example.demo.service.UserArticleService;
import com.example.demo.service.UserCourseService;
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
@Api(tags = "user-course")
@RestController
@RequestMapping("/demo/user-course")
public class UserCourseController {
    @Autowired
    private UserCourseService userCourseService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<UserCourse> all(){
        return userCourseService.list();
    }
    @GetMapping("one")//article/one?id=1
    public UserCourse one(Integer id){
        return userCourseService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody UserCourse Interview){
        boolean flag=userCourseService.save(Interview);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody UserCourse Interview){
        boolean flag=userCourseService.updateById(Interview);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return userCourseService.removeById(id);
    }
}
