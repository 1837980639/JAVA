package com.example.demo.Controller;


import com.example.demo.po.CompetitionCreate;
import com.example.demo.service.CompetitionCreateService;
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
@Api(tags ="Competition_create")
@RestController
@RequestMapping("/demo/competition-create")
public class CompetitionCreateController {
    @Autowired
    private CompetitionCreateService competition_createService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<CompetitionCreate> all(){
        return competition_createService.list();
    }
    @GetMapping("one")//article/one?id=1
    public CompetitionCreate one(Integer id){
        return competition_createService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody CompetitionCreate Competition_create){
        boolean flag=competition_createService.save(Competition_create);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody CompetitionCreate Competition_create){
        boolean flag=competition_createService.updateById(Competition_create);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return competition_createService.removeById(id);
    }
}
