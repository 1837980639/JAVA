package com.example.demo.Controller;


import com.example.demo.po.Department;
import com.example.demo.service.DepartmentService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api(tags ="Department")
@RestController
@RequestMapping("/Department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Department> all(){
        return departmentService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Department one(Integer id){
        return departmentService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Department Department){
        boolean flag=departmentService.save(Department);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Department Department){
        boolean flag=departmentService.updateById(Department);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return departmentService.removeById(id);
    }
}
