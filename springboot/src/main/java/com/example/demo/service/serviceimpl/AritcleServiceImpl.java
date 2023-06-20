package com.example.demo.service.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.ArticleMapper;
import com.example.demo.po.Article;
import com.example.demo.service.ArticleService;
import org.springframework.stereotype.Service;

@Service
public class AritcleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService{
}
