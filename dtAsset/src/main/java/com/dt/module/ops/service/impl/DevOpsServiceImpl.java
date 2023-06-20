package com.dt.module.ops.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dt.core.common.base.BaseService;
import com.dt.core.common.base.R;
import com.dt.core.dao.Rcd;
import com.dt.core.dao.RcdSet;
import com.dt.core.tool.util.ConvertUtil;
import com.dt.core.tool.util.ToolUtil;
import com.dt.module.ops.entity.KnBase;
import com.dt.module.ops.entity.NodeDevops;
import com.dt.module.ops.mapper.KnBaseMapper;
import com.dt.module.ops.mapper.NodeDevopsMapper;
import com.dt.module.ops.service.IDevOpsService;
import com.dt.module.ops.service.IKnBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author lank
 * @since 2020-03-06
 */
@Service
public class DevOpsServiceImpl extends ServiceImpl<NodeDevopsMapper, NodeDevops> implements IDevOpsService {

}
