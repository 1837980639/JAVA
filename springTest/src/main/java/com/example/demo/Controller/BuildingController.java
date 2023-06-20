package com.example.demo.Controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.mapper.BuildingMapper;
import com.example.demo.po.Building;
import com.example.demo.po.Test;
import com.example.demo.service.BuildingService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 宿舍楼 前端控制器
 * </p>
 *
 * @author 杨皓
 * @since 2022-10-14
 */
@Api(tags ="Building")
@RestController
@CrossOrigin
@RequestMapping("/demo/building")
public class BuildingController {

    @Autowired
    private BuildingMapper buildingMapper;
    @Autowired
    private BuildingService buildingService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public IPage<Building> all(Page<Building> page, QueryWrapper<Building> queryWrapper){
        return buildingMapper.selectPage(page,queryWrapper);
    }

    @GetMapping("one")//article/one?id=1
    public Building one(Integer id){
        return buildingService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Building Building,Page<Building> page, QueryWrapper<Building> queryWrapper){
        boolean flag=buildingService.save(Building);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Building Building,Page<Building> page, QueryWrapper<Building> queryWrapper){
        boolean flag=buildingService.updateById(Building);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        boolean flag=buildingService.removeById(id);
        return flag;
    }
}
