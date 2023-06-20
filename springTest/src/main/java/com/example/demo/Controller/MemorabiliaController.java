package com.example.demo.Controller;


import com.example.demo.po.Major;
import com.example.demo.po.Memorabilia;
import com.example.demo.service.MajorService;
import com.example.demo.service.MemorabiliaService;
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
@Api(tags = "memorabilia")
@RestController
@RequestMapping("/demo/memorabilia")
public class MemorabiliaController {
    @Autowired
    private MemorabiliaService memorabiliaService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Memorabilia> all(){
        return memorabiliaService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Memorabilia one(Integer id){
        return memorabiliaService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Memorabilia Interviw){
        boolean flag=memorabiliaService.save(Interviw);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Memorabilia Interviw){
        boolean flag=memorabiliaService.updateById(Interviw);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return memorabiliaService.removeById(id);
    }
}
