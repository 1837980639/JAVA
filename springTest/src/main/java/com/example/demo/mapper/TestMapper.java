package com.example.demo.mapper;

import com.example.demo.po.Test;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 杨皓
 * @since 2022-10-14
 */
@Mapper
public interface TestMapper extends BaseMapper<Test> {
}