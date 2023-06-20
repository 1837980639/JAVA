package com.example.demo.service.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.DepartmentMapper;
import com.example.demo.po.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper,Department>implements DepartmentService{
}
