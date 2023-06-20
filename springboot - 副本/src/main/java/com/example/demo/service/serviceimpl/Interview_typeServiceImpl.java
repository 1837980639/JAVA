package com.example.demo.service.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.Interview_typeMapper;
import com.example.demo.po.Interview_type;
import com.example.demo.service.Interview_typeService;
import org.springframework.stereotype.Service;

@Service
public class Interview_typeServiceImpl extends ServiceImpl<Interview_typeMapper, Interview_type>implements Interview_typeService {
}
