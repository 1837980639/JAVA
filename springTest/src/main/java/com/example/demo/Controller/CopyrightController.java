package com.example.demo.Controller;


import com.example.demo.po.Copyright;
import com.example.demo.service.CopyrightService;
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
@Api(tags ="Copyright")
@RestController
@RequestMapping("/demo/copyright")
public class CopyrightController {
    @Autowired
    private CopyrightService copyrightService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Copyright> all(){
        return copyrightService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Copyright one(Integer id){
        return copyrightService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Copyright Copyright){
        boolean flag=copyrightService.save(Copyright);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Copyright Copyright){
        boolean flag=copyrightService.updateById(Copyright);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return copyrightService.removeById(id);
    }
}
