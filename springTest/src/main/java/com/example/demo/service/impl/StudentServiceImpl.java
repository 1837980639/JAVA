package com.example.demo.service.impl;

import com.example.demo.po.Student;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 杨皓
 * @since 2022-10-14
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
