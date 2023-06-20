package com.example.demo.service.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.ClassinfoMapper;
import com.example.demo.po.Classinfo;
import com.example.demo.service.ClassinfoService;
import org.springframework.stereotype.Service;

@Service
public class ClassinfoServiceImpl extends ServiceImpl<ClassinfoMapper, Classinfo> implements ClassinfoService {
}
