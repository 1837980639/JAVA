package com.example.demo.Controller;


import com.example.demo.po.QuestionCate;
import com.example.demo.po.Region;
import com.example.demo.service.QuestionCateService;
import com.example.demo.service.RegionService;
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
@Api(tags = "region")
@RestController
@RequestMapping("/demo/region")
public class RegionController {
    @Autowired
    private RegionService regionService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Region> all(){
        return regionService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Region one(Integer id){
        return regionService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Region Interview){
        boolean flag=regionService.save(Interview);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Region Interview){
        boolean flag=regionService.updateById(Interview);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return regionService.removeById(id);
    }
}
