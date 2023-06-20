package com.example.demo.service.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.Frontend_menuMapper;
import com.example.demo.po.Frontend_menu;
import com.example.demo.service.Frontend_menuService;
import org.springframework.stereotype.Service;

@Service
public class Frontend_menuServiceImpl extends ServiceImpl<Frontend_menuMapper, Frontend_menu>implements Frontend_menuService {
}
