package com.example.demo.Controller;


import com.example.demo.po.Course;
import com.example.demo.service.CourseService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api(tags ="Course")
@RestController
@RequestMapping("/Course")
public class CourseContreller {
    @Autowired
    private CourseService courseService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Course> all(){
        return courseService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Course one(Integer id){
        return courseService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Course Course){
        boolean flag=courseService.save(Course);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Course Course){
        boolean flag=courseService.updateById(Course);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return courseService.removeById(id);
    }
}
