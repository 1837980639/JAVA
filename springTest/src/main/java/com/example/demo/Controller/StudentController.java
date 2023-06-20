package com.example.demo.Controller;


import com.example.demo.mapper.StudentMapper;
import com.example.demo.po.School;
import com.example.demo.po.Student;
import com.example.demo.service.SchoolService;
import com.example.demo.service.StudentService;
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
@Api(tags = "student")
@RestController
@RequestMapping("/demo/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Student> all(){
        return studentService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Student one(Integer id){
        return studentService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Student Interview){
        boolean flag=studentService.save(Interview);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Student Interview){
        boolean flag=studentService.updateById(Interview);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return studentService.removeById(id);
    }
}
