package com.example.demo.service.impl;

import com.example.demo.po.Interview;
import com.example.demo.mapper.InterviewMapper;
import com.example.demo.service.InterviewService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 面试题 服务实现类
 * </p>
 *
 * @author 杨皓
 * @since 2022-10-14
 */
@Service
public class InterviewServiceImpl extends ServiceImpl<InterviewMapper, Interview> implements InterviewService {

}
