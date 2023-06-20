package com.example.demo.service.impl;

import com.example.demo.po.Course;
import com.example.demo.mapper.CourseMapper;
import com.example.demo.service.CourseService;
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
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements CourseService {

}
