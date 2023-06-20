package com.example.demo.service.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.Backend_apiMapper;
import com.example.demo.po.Backend_api;
import com.example.demo.service.Backend_apiService;
import org.springframework.stereotype.Service;

@Service
public class Backend_apiServiceImpl extends ServiceImpl<Backend_apiMapper, Backend_api> implements Backend_apiService {
}
