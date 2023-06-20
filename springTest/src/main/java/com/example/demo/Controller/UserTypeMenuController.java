package com.example.demo.Controller;


import com.example.demo.po.UserRole;
import com.example.demo.po.UserTypeMenu;
import com.example.demo.service.UserRoleService;
import com.example.demo.service.UserTypeMenuService;
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
@Api(tags = "user-type-menu")
@RestController
@RequestMapping("/demo/user-type-menu")
public class UserTypeMenuController {
    @Autowired
    private UserTypeMenuService userTypeMenuService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<UserTypeMenu> all(){
        return userTypeMenuService.list();
    }
    @GetMapping("one")//article/one?id=1
    public UserTypeMenu one(Integer id){
        return userTypeMenuService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody UserTypeMenu Interview){
        boolean flag=userTypeMenuService.save(Interview);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody UserTypeMenu Interview){
        boolean flag=userTypeMenuService.updateById(Interview);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return userTypeMenuService.removeById(id);
    }
}
