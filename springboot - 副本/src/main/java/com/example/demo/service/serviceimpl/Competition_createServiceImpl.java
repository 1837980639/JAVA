package com.example.demo.service.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.Competition_createMapper;
import com.example.demo.po.Competition_create;
import com.example.demo.service.Competition_createService;
import org.springframework.stereotype.Service;

@Service
public class Competition_createServiceImpl extends ServiceImpl<Competition_createMapper, Competition_create> implements Competition_createService{
}
