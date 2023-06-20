package com.example.demo.Controller;


import com.example.demo.po.Competition;
import com.example.demo.service.CompetitionService;
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
@Api(tags ="Competition")
@RestController
@RequestMapping("/demo/competition")
public class CompetitionController {
    @Autowired
    private CompetitionService competitionService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Competition> all(){
        return competitionService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Competition one(Integer id){
        return competitionService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Competition Competition){
        boolean flag=competitionService.save(Competition);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Competition Competition){
        boolean flag=competitionService.updateById(Competition);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return competitionService.removeById(id);
    }
}
