package com.example.demo.Controller;


import com.example.demo.po.Result;
import com.example.demo.po.ResultCode;
import com.example.demo.po.UserArticle;
import com.example.demo.service.UserArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 秦坤
 * @since 2023-03-05
 */
@RestController
@CrossOrigin
@RequestMapping("/demo/UserArticle")
public class UserArticleController {
    @Autowired
    private UserArticleService userArticleService;

    @GetMapping("/all")
    public Result all(){
        List<UserArticle> resources= userArticleService.list();
        if(CollectionUtils.isEmpty(resources)){
            return Result.error(ResultCode.NODATA);
        }
        Map<String,Object> map=new HashMap<>();
        map.put("resources",resources);
        return Result.ok(map);
    }
    @PostMapping("/add")
    public boolean add(@RequestBody UserArticle userArticle){
        boolean flag=userArticleService.save(userArticle);
        return flag;
    }
    @PostMapping("/update")
    public boolean edit(@RequestBody UserArticle userArticle){
        boolean flag=userArticleService.updateById(userArticle);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return userArticleService.removeById(id);
    }
}
