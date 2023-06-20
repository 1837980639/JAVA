package com.example.demo.service.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.DormitoryMapper;
import com.example.demo.po.Dormitory;
import com.example.demo.service.DormitoryService;
import org.springframework.stereotype.Service;

@Service
public class DormitoryServiceImpl extends ServiceImpl<DormitoryMapper, Dormitory>implements DormitoryService {
}
