package com.example.demo.service.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.Article_catMapper;
import com.example.demo.po.Article_cat;
import com.example.demo.service.Article_catService;
import org.springframework.stereotype.Service;

@Service
public class Article_catServiceImpl extends ServiceImpl<Article_catMapper, Article_cat> implements Article_catService {
}
