package com.example.demo.service.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.Competition_signupMapper;
import com.example.demo.po.Competition_signup;
import com.example.demo.service.Competition_signupService;
import org.springframework.stereotype.Service;

@Service
public class Competition_signupServiceImpl extends ServiceImpl <Competition_signupMapper, Competition_signup> implements Competition_signupService {
}
