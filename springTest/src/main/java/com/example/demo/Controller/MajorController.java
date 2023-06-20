package com.example.demo.Controller;


import com.example.demo.po.Major;
import com.example.demo.service.MajorService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * רҵ 前端控制器
 * </p>
 *
 * @author 杨皓
 * @since 2022-10-14
 */
@Api("/major")
@RestController
@RequestMapping("/demo/major")
public class MajorController {
    @Autowired
    private MajorService majorService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Major> all(){
        return majorService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Major one(Integer id){
        return majorService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Major Interviw){
        boolean flag=majorService.save(Interviw);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Major Interviw){
        boolean flag=majorService.updateById(Interviw);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return majorService.removeById(id);
    }
}
