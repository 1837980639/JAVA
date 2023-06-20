package com.example.demo.service.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.CompetitionMapper;
import com.example.demo.po.Competition;
import com.example.demo.service.CompetitionService;
import org.springframework.stereotype.Service;

@Service
public class CompetitionServiceImpl extends ServiceImpl<CompetitionMapper, Competition> implements CompetitionService {
}
