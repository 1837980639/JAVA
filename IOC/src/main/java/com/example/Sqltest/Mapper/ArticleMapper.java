package com.example.Sqltest.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.Sqltest.service.po.Article;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper extends BaseMapper<Article> {
}
