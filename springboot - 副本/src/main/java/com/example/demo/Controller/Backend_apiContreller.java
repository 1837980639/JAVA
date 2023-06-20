package com.example.demo.Controller;

import com.example.demo.po.Backend_api;

import com.example.demo.service.Backend_apiService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags ="Backend_api")
@RestController
@RequestMapping("/Backend_api")
public class Backend_apiContreller {
    @Autowired
    private Backend_apiService Backend_apiService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Backend_api> all(){
        return Backend_apiService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Backend_api one(Integer id){
        return Backend_apiService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Backend_api Backend_api){
        boolean flag=Backend_apiService.save(Backend_api);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Backend_api Backend_api){
        boolean flag=Backend_apiService.updateById(Backend_api);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return Backend_apiService.removeById(id);
    }
}
