package com.example.demo.Controller;


import com.example.demo.po.Community;
import com.example.demo.po.CommunitySignup;
import com.example.demo.service.CommunityService;
import com.example.demo.service.CommunitySignupService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * ���� 前端控制器
 * </p>
 *
 * @author 杨皓
 * @since 2022-10-14
 */
@Api(tags ="Community")
@RestController
@RequestMapping("/demo/community")
public class CommunityController {
    @Autowired
    private CommunityService communityService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Community> all(){
        return communityService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Community one(Integer id){
        return communityService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Community Community){
        boolean flag=communityService.save(Community);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Community Community){
        boolean flag=communityService.updateById(Community);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return communityService.removeById(id);
    }
}
