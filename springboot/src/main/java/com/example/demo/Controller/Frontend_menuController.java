package com.example.demo.Controller;


import com.example.demo.po.Frontend_menu;
import com.example.demo.service.Frontend_menuService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api(tags ="Frontend_menu")
@RestController
@RequestMapping("/Frontend_menu")
public class Frontend_menuController {
    @Autowired
    private Frontend_menuService frontend_menuService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Frontend_menu> all(){
        return frontend_menuService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Frontend_menu one(Integer id){
        return frontend_menuService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Frontend_menu Frontend_menu){
        boolean flag=frontend_menuService.save(Frontend_menu);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Frontend_menu Frontend_menu){
        boolean flag=frontend_menuService.updateById(Frontend_menu);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return frontend_menuService.removeById(id);
    }
}
