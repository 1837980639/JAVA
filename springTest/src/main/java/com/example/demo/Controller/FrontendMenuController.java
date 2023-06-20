package com.example.demo.Controller;


import com.example.demo.po.FrontendMenu;
import com.example.demo.service.FrontendMenuService;
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
@Api(tags ="Frontend_menu")
@RestController
@RequestMapping("/demo/frontend-menu")
public class FrontendMenuController {
    @Autowired
    private FrontendMenuService frontend_menuService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<FrontendMenu> all(){
        return frontend_menuService.list();
    }
    @GetMapping("one")//article/one?id=1
    public FrontendMenu one(Integer id){
        return frontend_menuService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody FrontendMenu Frontend_menu){
        boolean flag=frontend_menuService.save(Frontend_menu);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody FrontendMenu Frontend_menu){
        boolean flag=frontend_menuService.updateById(Frontend_menu);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return frontend_menuService.removeById(id);
    }
}
