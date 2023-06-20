package com.example.demo.service.impl;

import com.example.demo.po.Patent;
import com.example.demo.mapper.PatentMapper;
import com.example.demo.service.PatentService;
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
public class PatentServiceImpl extends ServiceImpl<PatentMapper, Patent> implements PatentService {

}
