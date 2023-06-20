package com.example.demo.Controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.exception.MyException;
import com.example.demo.mapper.TestMapper;
import com.example.demo.po.Result;
import com.example.demo.po.ResultCode;
import com.example.demo.po.Test;
import com.example.demo.service.TestService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
 * @author 杨皓
 * @since 2022-10-14
 */
@Api(tags ="Test")
@RestController
@CrossOrigin
@RequestMapping("/demo/test")
public class TestController {
    @Autowired
    private TestMapper testMapper;

    @Autowired
    private TestService testService;
    @GetMapping("/TEST")
    public IPage<Test> pageByGender(Page<Test> page, QueryWrapper<Test> queryWrapper){
        return testMapper.selectPage(page,queryWrapper);
    }
//    @RequestMapping(Value="/all",method = RequestMethod.DELETE)
    @GetMapping("/ty")
    public Result all(){
        List<Test> tests=testService.list();
        if(CollectionUtils.isEmpty(tests)){
            return Result.error(ResultCode.NODATA);
        }
        Map<String,Object> map=new HashMap<>();
        map.put("test",tests);
        return Result.ok(map);
    }

    @PostMapping ("/one")
    public Result one(Integer id){
        if(id==null){
            throw new MyException(ResultCode.PARAM_IS_BLANK);
        }
        List<Test> tests=testService.list();
        if(CollectionUtils.isEmpty(tests)){
            return Result.error(ResultCode.NODATA);
        }
        Map<String,Object> map=new HashMap<>();
        map.put("test",tests);
        return Result.ok(map);
    }

}
