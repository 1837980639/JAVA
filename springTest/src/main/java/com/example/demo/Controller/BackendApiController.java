package com.example.demo.Controller;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.po.BackendApi;
import com.example.demo.service.BackendApiService;
import io.swagger.annotations.Api;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
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
@Api(tags ="BackendApi")
@RestController
@CrossOrigin
@RequestMapping("/demo/backend-api")
public class BackendApiController {
    @Autowired
    private BackendApiService Backend_apiService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<BackendApi> all(){
        return Backend_apiService.list();
    }
    @GetMapping("one")//article/one?id=1
    public BackendApi one(Integer id){
        return Backend_apiService.getById(id);
    }

    @PostMapping("/add")//
    public BackendApi add(@RequestBody BackendApi Backend_api){
        boolean flag=Backend_apiService.save(Backend_api);
        return Backend_api;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody BackendApi Backend_api){
        boolean flag=Backend_apiService.updateById(Backend_api);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return Backend_apiService.removeById(id);
    }

    @GetMapping("/test")
    public void getById(){

    }
}
