package com.dt.module.ops.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dt.module.ops.entity.BusInfo;
import com.dt.module.ops.entity.BusInfoHistory;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yh
 * @since 2023-03-21
 */
@Mapper
public interface BusInfoHistoryMapper extends BaseMapper<BusInfoHistory> {

}
