package com.example.demo.service.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.Interview_remarkMapper;
import com.example.demo.po.Interview_remark;
import com.example.demo.service.Interview_remarkService;
import org.springframework.stereotype.Service;

@Service
public class Interview_remarkServiceImpl extends ServiceImpl<Interview_remarkMapper, Interview_remark>implements Interview_remarkService {
}
