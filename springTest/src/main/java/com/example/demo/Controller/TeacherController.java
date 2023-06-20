package com.example.demo.Controller;


import com.example.demo.po.Student;
import com.example.demo.po.Teacher;
import com.example.demo.service.StudentService;
import com.example.demo.service.TeacherService;
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
@Api(tags = "teacher")
@RestController
@RequestMapping("/demo/teacher")
public class TeacherController {
    @Autowired
    private TeacherService TeacherService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Teacher> all(){
        return TeacherService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Teacher one(Integer id){
        return TeacherService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Teacher Interview){
        boolean flag=TeacherService.save(Interview);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Teacher Interview){
        boolean flag=TeacherService.updateById(Interview);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return TeacherService.removeById(id);
    }
}
