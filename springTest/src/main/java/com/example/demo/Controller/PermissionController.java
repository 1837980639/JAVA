package com.example.demo.Controller;


import com.example.demo.po.Patent;
import com.example.demo.po.Permission;
import com.example.demo.service.PatentService;
import com.example.demo.service.PermissionService;
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
@Api(tags = "permission")
@RestController
@RequestMapping("/demo/permission")
public class PermissionController {
    @Autowired
    private PermissionService permissionService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Permission> all(){
        return permissionService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Permission one(Integer id){
        return permissionService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Permission Interview){
        boolean flag=permissionService.save(Interview);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Permission Interview){
        boolean flag=permissionService.updateById(Interview);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return permissionService.removeById(id);
    }
}
