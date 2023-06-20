package com.example.demo.Controller;


import com.example.demo.po.CommunitySignup;
import com.example.demo.service.CommunitySignupService;
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
@Api(tags ="Community_signup")
@RestController
@RequestMapping("/demo/community-signup")
public class CommunitySignupController {
    @Autowired
    private CommunitySignupService community_signupService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<CommunitySignup> all(){
        return community_signupService.list();
    }
    @GetMapping("one")//article/one?id=1
    public CommunitySignup one(Integer id){
        return community_signupService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody CommunitySignup Community_signup){
        boolean flag=community_signupService.save(Community_signup);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody CommunitySignup Community_signup){
        boolean flag=community_signupService.updateById(Community_signup);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return community_signupService.removeById(id);
    }
}
