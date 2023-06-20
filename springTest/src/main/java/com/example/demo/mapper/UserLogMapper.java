package com.example.demo.mapper;

import com.example.demo.po.UserLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户日志 Mapper 接口
 * </p>
 *
 * @author 杨皓
 * @since 2022-10-14
 */
@Mapper
public interface UserLogMapper extends BaseMapper<UserLog> {

}
