package com.example.demo.Controller;


import com.example.demo.po.Bank;
import com.example.demo.service.BankService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api(tags ="Bank")
@RestController
@RequestMapping("/Bank")
public class BankContreller {
    @Autowired
    private BankService bankService;

    @GetMapping("/all")//http://localhost:8080/article/all
    public List<Bank> all(){
        return bankService.list();
    }
    @GetMapping("one")//article/one?id=1
    public Bank one(Integer id){
        return bankService.getById(id);
    }

    @PostMapping("/add")//
    public boolean add(@RequestBody Bank Bank){
        boolean flag=bankService.save(Bank);
        return flag;
    }
    @PostMapping("/edit")
    public boolean edit(@RequestBody Bank Bank){
        boolean flag=bankService.updateById(Bank);
        return flag;
    }
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return bankService.removeById(id);
    }
}
