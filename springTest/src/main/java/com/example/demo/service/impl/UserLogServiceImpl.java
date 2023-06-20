package com.example.demo.service.impl;

import com.example.demo.po.UserLog;
import com.example.demo.mapper.UserLogMapper;
import com.example.demo.service.UserLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户日志 服务实现类
 * </p>
 *
 * @author 杨皓
 * @since 2022-10-14
 */
@Service
public class UserLogServiceImpl extends ServiceImpl<UserLogMapper, UserLog> implements UserLogService {

}
