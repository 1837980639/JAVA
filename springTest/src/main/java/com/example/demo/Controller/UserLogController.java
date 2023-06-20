package com.example.demo.Controller;


import com.example.demo.po.UserLog;
import com.example.demo.po.Userinfo;
import com.example.demo.service.UserLogService;
import com.example.demo.service.UserinfoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 用户日志 前端控制器
 * </p>
 *
 * @author 杨皓
 * @since 2022-10-14
 */
@Api(tags = "user-log")
@RestController
@RequestMapping("/demo/user-log")
public class UserLogController {
    @Autowired
    private UserLogService userLogService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<UserLog> all(){
        return userLogService.list();
    }
    @GetMapping("one")//article/one?id=1
    public UserLog one(Integer id){
        return userLogService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody UserLog Interview){
        boolean flag=userLogService.save(Interview);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody UserLog Interview){
        boolean flag=userLogService.updateById(Interview);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return userLogService.removeById(id);
    }
}
