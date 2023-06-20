package com.example.demo.controller;


import com.example.demo.po.Dormitory;
import com.example.demo.service.DormitoryService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 单个宿舍 前端控制器
 * </p>
 *
 * @author 杨皓
 * @since 2022-10-14
 */
@Api(tags ="Dormitory")
@RestController
@RequestMapping("/demo/dormitory")
public class DormitoryController {
    @Autowired
    private DormitoryService dormitoryService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Dormitory> all(){
        return dormitoryService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Dormitory one(Integer id){
        return dormitoryService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Dormitory Dormitory){
        boolean flag=dormitoryService.save(Dormitory);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Dormitory Dormitory){
        boolean flag=dormitoryService.updateById(Dormitory);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return dormitoryService.removeById(id);
    }
}
