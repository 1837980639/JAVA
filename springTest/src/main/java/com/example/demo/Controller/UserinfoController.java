package com.example.demo.Controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.po.UserCourse;
import com.example.demo.po.Userinfo;
import com.example.demo.service.UserCourseService;
import com.example.demo.service.UserinfoService;
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
@Api(tags = "userinfo")
@RestController
@CrossOrigin
@RequestMapping("/demo/userinfo")
public class UserinfoController {
    @Autowired
    private UserinfoService userinfoService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Userinfo> all(){
        return userinfoService.list();
    }
    @GetMapping("/one")
    public Userinfo one(){
        System.out.println(1);
        LambdaQueryWrapper<Userinfo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(Userinfo::getUserName,"yh").like(Userinfo::getPassword,"123");
        System.out.println(userinfoService.getOne(queryWrapper));
        return userinfoService.getOne(queryWrapper);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Userinfo Interview){
        boolean flag=userinfoService.save(Interview);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Userinfo Interview){
        boolean flag=userinfoService.updateById(Interview);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return userinfoService.removeById(id);
    }
}
