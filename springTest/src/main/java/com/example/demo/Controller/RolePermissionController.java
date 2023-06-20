package com.example.demo.Controller;


import com.example.demo.po.Region;
import com.example.demo.po.RolePermission;
import com.example.demo.service.RegionService;
import com.example.demo.service.RolePermissionService;
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
@Api(tags = "role-permission")
@RestController
@RequestMapping("/demo/role-permission")
public class RolePermissionController {
    @Autowired
    private RolePermissionService rolePermissionService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<RolePermission> all(){
        return rolePermissionService.list();
    }
    @GetMapping("one")//article/one?id=1
    public RolePermission one(Integer id){
        return rolePermissionService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody RolePermission Interview){
        boolean flag=rolePermissionService.save(Interview);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody RolePermission Interview){
        boolean flag=rolePermissionService.updateById(Interview);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return rolePermissionService.removeById(id);
    }
}
