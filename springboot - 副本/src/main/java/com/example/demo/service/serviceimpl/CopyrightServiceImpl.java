package com.example.demo.service.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.CopyrightMapper;
import com.example.demo.po.Copyright;
import com.example.demo.service.CopyrightService;
import org.springframework.stereotype.Service;

@Service
public class CopyrightServiceImpl extends ServiceImpl<CopyrightMapper, Copyright>implements CopyrightService {
}
