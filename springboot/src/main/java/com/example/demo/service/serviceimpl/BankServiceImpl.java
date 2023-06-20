package com.example.demo.service.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.BankMapper;
import com.example.demo.po.Bank;
import com.example.demo.service.BankService;
import org.springframework.stereotype.Service;

@Service
public class BankServiceImpl extends ServiceImpl<BankMapper, Bank> implements BankService {
}
