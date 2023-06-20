package com.example.demo.Controller;


import com.example.demo.po.CompetitionSignup;
import com.example.demo.service.CompetitionSignupService;
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
@Api(tags ="Competition_signup")
@RestController
@RequestMapping("/demo/competition-signup")
public class CompetitionSignupController {
    @Autowired
    private CompetitionSignupService competition_signupService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<CompetitionSignup> all(){
        return competition_signupService.list();
    }
    @GetMapping("one")//article/one?id=1
    public CompetitionSignup one(Integer id){
        return competition_signupService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody CompetitionSignup Competition_signup){
        boolean flag=competition_signupService.save(Competition_signup);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody CompetitionSignup Competition_signup){
        boolean flag=competition_signupService.updateById(Competition_signup);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return competition_signupService.removeById(id);
    }
}
