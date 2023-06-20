package com.example.demo.Controller;


import com.example.demo.po.Memorabilia;
import com.example.demo.po.Pager;
import com.example.demo.service.MemorabiliaService;
import com.example.demo.service.PagerService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 试卷 前端控制器
 * </p>
 *
 * @author 杨皓
 * @since 2022-10-14
 */
@Api(tags = "pager")
@RestController
@RequestMapping("/demo/pager")
public class PagerController {
    @Autowired
    private PagerService pagerService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Pager> all(){
        return pagerService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Pager one(Integer id){
        return pagerService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Pager Interviw){
        boolean flag=pagerService.save(Interviw);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Pager Interviw){
        boolean flag=pagerService.updateById(Interviw);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return pagerService.removeById(id);
    }
}
