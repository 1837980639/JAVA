package com.example.demo.Controller;


import com.example.demo.po.Role;
import com.example.demo.po.RoleBackendApi;
import com.example.demo.service.RoleBackendApiService;
import com.example.demo.service.RoleService;
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
@Api(tags = "role")
@RestController
@RequestMapping("/demo/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Role> all(){
        return roleService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Role one(Integer id){
        return roleService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Role Interview){
        boolean flag=roleService.save(Interview);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Role Interview){
        boolean flag=roleService.updateById(Interview);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return roleService.removeById(id);
    }
}
