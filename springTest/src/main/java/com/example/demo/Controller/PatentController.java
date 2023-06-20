package com.example.demo.Controller;


import com.example.demo.po.Pager;
import com.example.demo.po.Patent;
import com.example.demo.service.PagerService;
import com.example.demo.service.PatentService;
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
@Api(tags = "patent")
@RestController
@RequestMapping("/demo/patent")
public class PatentController {
    @Autowired
    private PatentService patentService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Patent> all(){
        return patentService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Patent one(Integer id){
        return patentService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Patent Interviw){
        boolean flag=patentService.save(Interviw);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Patent Interviw){
        boolean flag=patentService.updateById(Interviw);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return patentService.removeById(id);
    }
}
