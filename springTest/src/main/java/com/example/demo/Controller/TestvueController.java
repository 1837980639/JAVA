package com.example.demo.controller;


import com.example.demo.po.Bank;
import com.example.demo.po.Testvue;
import com.example.demo.service.TestvueService;
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
 * @since 2022-12-16
 */
@Api(tags="TestVue")
@RestController
@CrossOrigin
@RequestMapping("/demo/testvue")
public class TestvueController {
    @Autowired
    private TestvueService testvueService;

    @GetMapping("all")
    public List<Testvue> all(){
        return testvueService.list();
    }

    @GetMapping("delete")
    public boolean delete(Integer id){
        return testvueService.removeById(id);
    }

    @PostMapping("update")
    public boolean update(@RequestBody Testvue testvue){
        boolean flag=testvueService.updateById(testvue);
        return flag;
    }
    @PostMapping("add")
    public boolean add(@RequestBody Testvue testvue){
        boolean flag=testvueService.save(testvue);
        return flag;
    }
}
