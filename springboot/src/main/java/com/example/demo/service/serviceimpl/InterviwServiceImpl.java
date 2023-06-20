package com.example.demo.service.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.InterviwMapper;
import com.example.demo.po.Interviw;
import com.example.demo.service.InterviwService;
import org.springframework.stereotype.Service;

@Service
public class InterviwServiceImpl extends ServiceImpl<InterviwMapper, Interviw>implements InterviwService {
}
