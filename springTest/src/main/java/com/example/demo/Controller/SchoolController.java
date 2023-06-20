package com.example.demo.Controller;


import com.example.demo.po.RolePermission;
import com.example.demo.po.School;
import com.example.demo.service.RolePermissionService;
import com.example.demo.service.SchoolService;
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
@Api(tags = "school")
@RestController
@RequestMapping("/demo/school")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<School> all(){
        return schoolService.list();
    }
    @GetMapping("one")//article/one?id=1
    public School one(Integer id){
        return schoolService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody School Interview){
        boolean flag=schoolService.save(Interview);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody School Interview){
        boolean flag=schoolService.updateById(Interview);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return schoolService.removeById(id);
    }
}
