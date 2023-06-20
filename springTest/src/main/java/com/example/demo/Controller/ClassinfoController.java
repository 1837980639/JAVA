package com.example.demo.Controller;


import com.example.demo.po.Classinfo;
import com.example.demo.service.ClassinfoService;
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
@Api(tags ="Classinfo")
@RestController
@CrossOrigin
@RequestMapping("/demo/classinfo")
public class ClassinfoController {
    @Autowired
    private ClassinfoService classinfoService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Classinfo> all(){
        return classinfoService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Classinfo one(Integer id){
        return classinfoService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Classinfo Classinfo){
        boolean flag=classinfoService.save(Classinfo);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Classinfo Classinfo){
        boolean flag=classinfoService.updateById(Classinfo);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return classinfoService.removeById(id);
    }
}
