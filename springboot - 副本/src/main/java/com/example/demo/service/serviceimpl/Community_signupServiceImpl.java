package com.example.demo.service.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.Community_signupMapper;
import com.example.demo.po.Community_signup;
import com.example.demo.service.Community_signupService;
import org.springframework.stereotype.Service;

@Service
public class Community_signupServiceImpl extends ServiceImpl<Community_signupMapper, Community_signup> implements Community_signupService {
}
