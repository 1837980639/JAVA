package com.example.demo.Controller;


import com.example.demo.po.UserLog;
import com.example.demo.po.UserRole;
import com.example.demo.service.UserLogService;
import com.example.demo.service.UserRoleService;
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
@Api(tags = "user-role")
@RestController
@RequestMapping("/demo/user-role")
public class UserRoleController {
    @Autowired
    private UserRoleService userRoleService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<UserRole> all(){
        return userRoleService.list();
    }
    @GetMapping("one")//article/one?id=1
    public UserRole one(Integer id){
        return userRoleService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody UserRole Interview){
        boolean flag=userRoleService.save(Interview);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody UserRole Interview){
        boolean flag=userRoleService.updateById(Interview);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return userRoleService.removeById(id);
    }
}
