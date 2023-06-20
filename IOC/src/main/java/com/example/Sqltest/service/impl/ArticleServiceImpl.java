package com.example.Sqltest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.Sqltest.Mapper.ArticleMapper;
import com.example.Sqltest.service.po.Article;
import com.example.Sqltest.service.ArticleService;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {
}
