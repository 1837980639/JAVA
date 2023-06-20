package com.dt.module.ops.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dt.module.ops.entity.BusInfo;
import com.dt.module.ops.entity.BusInfoHistory;
import com.dt.module.ops.mapper.BusInfoHistoryMapper;
import com.dt.module.ops.mapper.BusInfoMapper;
import com.dt.module.ops.service.BusInfoHistroyService;
import com.dt.module.ops.service.BusInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yh
 * @since 2023-03-21
 */
@Service
public class BusInfoHistoryServiceImpl extends ServiceImpl<BusInfoHistoryMapper,BusInfoHistory> implements BusInfoHistroyService {

}
