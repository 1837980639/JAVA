package com.example.demo.Controller;


import com.example.demo.po.Region;
import com.example.demo.po.RoleBackendApi;
import com.example.demo.service.RegionService;
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
@Api(tags = "role-backend-api")
@RestController
@RequestMapping("/demo/role-backend-api")
public class RoleBackendApiController {
    @Autowired
    private RoleBackendApiService roleBackendApiService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<RoleBackendApi> all(){
        return roleBackendApiService.list();
    }
    @GetMapping("one")//article/one?id=1
    public RoleBackendApi one(Integer id){
        return roleBackendApiService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody RoleBackendApi Interview){
        boolean flag=roleBackendApiService.save(Interview);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody RoleBackendApi Interview){
        boolean flag=roleBackendApiService.updateById(Interview);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return roleBackendApiService.removeById(id);
    }
}
