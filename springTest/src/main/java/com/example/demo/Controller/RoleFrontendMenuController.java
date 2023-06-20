package com.example.demo.Controller;


import com.example.demo.po.RoleBackendApi;
import com.example.demo.po.RoleFrontendMenu;
import com.example.demo.service.RoleBackendApiService;
import com.example.demo.service.RoleFrontendMenuService;
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
@Api(tags = "role-frontend-menu")
@RestController
@RequestMapping("/demo/role-frontend-menu")
public class RoleFrontendMenuController {
    @Autowired
    private RoleFrontendMenuService roleFrontendMenuService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<RoleFrontendMenu> all(){
        return roleFrontendMenuService.list();
    }
    @GetMapping("one")//article/one?id=1
    public RoleFrontendMenu one(Integer id){
        return roleFrontendMenuService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody RoleFrontendMenu Interview){
        boolean flag=roleFrontendMenuService.save(Interview);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody RoleFrontendMenu Interview){
        boolean flag=roleFrontendMenuService.updateById(Interview);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return roleFrontendMenuService.removeById(id);
    }
}
