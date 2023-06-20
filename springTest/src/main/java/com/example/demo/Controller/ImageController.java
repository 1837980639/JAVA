package com.example.demo.controller;


import com.example.demo.po.Image;
import com.example.demo.service.ImageService;
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
@Api(tags ="Image")
@RestController
@RequestMapping("/demo/image")
public class ImageController {
    @Autowired
    private ImageService imageService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Image> all(){
        return imageService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Image one(Integer id){
        return imageService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Image Image){
        boolean flag=imageService.save(Image);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Image Image){
        boolean flag=imageService.updateById(Image);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return imageService.removeById(id);
    }
}
