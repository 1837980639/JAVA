package com.example.demo.service.impl;

import com.example.demo.po.Bank;
import com.example.demo.mapper.BankMapper;
import com.example.demo.service.BankService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 题库 服务实现类
 * </p>
 *
 * @author 杨皓
 * @since 2022-10-14
 */
@Service
public class BankServiceImpl extends ServiceImpl<BankMapper, Bank> implements BankService {

}
