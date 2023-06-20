package com.dt.module.ops.controller;


import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dt.core.annotion.Acl;
import com.dt.core.common.base.BaseController;
import com.dt.core.common.base.R;
import com.dt.core.tool.util.DbUtil;
import com.dt.module.ops.entity.BusInfo;
import com.dt.module.ops.entity.BusInfoHistory;
import com.dt.module.ops.entity.NodeDevops;
import com.dt.module.ops.mapper.BusInfoHistoryMapper;
import com.dt.module.ops.mapper.BusInfoMapper;
import com.dt.module.ops.service.BusInfoHistroyService;
import com.dt.module.ops.service.BusInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.nio.file.CopyOption;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yh
 * @since 2023-03-21
 */
@RestController
@RequestMapping("/api/ops/busInfo")
public class BusInfoController extends BaseController {

    @Autowired
    private BusInfoService busInfoService;
    @Lazy
    @Resource
    private BusInfoHistoryMapper busInfoHistoryMapper;

    @Autowired
    private BusInfoHistroyService busInfoHistroyService;

    @ResponseBody
    @Acl(info = "查询全部", value = Acl.ACL_ALLOW)
    @RequestMapping(value = "/getall.do")
    public R selectPage(String start, String length, @RequestParam(value = "limit", required = true) String pageSize, @RequestParam(value = "page", required = true, defaultValue = "1") String pageIndex, String search) {
        JSONObject respar = DbUtil.formatPageParameter(start, length, pageSize, pageIndex);
        int pagesize = respar.getIntValue("pagesize");
        int pageindex = respar.getIntValue("pageindex");
        LambdaQueryWrapper<BusInfo> eq = Wrappers.<BusInfo>lambdaQuery().eq(BusInfo::getIsDelete, "0");
        IPage<BusInfo> pdata = busInfoService.page(new Page<>(pageindex, pagesize), eq);

        JSONObject retrunObject = new JSONObject();
        retrunObject.put("code", 0);
        retrunObject.put("count", pdata.getTotal());
        retrunObject.put("data", JSONArray.parseArray(JSON.toJSONString(pdata.getRecords(), SerializerFeature.WriteDateUseDateFormat, SerializerFeature.DisableCircularReferenceDetect)));
        return R.clearAttachDirect(retrunObject);
    }


    @ResponseBody
    @Acl(info = "添加数据（表单提交）", value = Acl.ACL_ALLOW)
    @RequestMapping(value = "/submit.do")
    public R submit(BusInfo busInfo) {
        BusInfoHistory busInfoHistory = new BusInfoHistory();
        BeanUtil.copyProperties(busInfo, busInfoHistory);
        boolean save = busInfoHistroyService.save(busInfoHistory);
        boolean flag = busInfoService.saveOrUpdate(busInfo);
        return R.SUCCESS_OPER(JSON.parse(JSON.toJSONString(busInfoHistory)));
    }

    @ResponseBody
    @Acl(info = "根据Id删除", value = Acl.ACL_USER)
    @RequestMapping(value = "/deleteById.do")
    public R deleteById(String ids) {
        String[] split = ids.split(",");
        System.out.println(ids);
        for (String id : split) {
            BusInfoHistory busInfoHistory = new BusInfoHistory();
            BusInfo busInfo = busInfoService.getById(Integer.valueOf(id));
            BeanUtils.copyProperties(busInfo, busInfoHistory);
            busInfoHistory.setIsDelete("1");
            if (!busInfoHistroyService.save(busInfoHistory)) {
                throw new RuntimeException("未知异常");
            }
        }
        return R.SUCCESS_OPER(busInfoService.removeByIds(Arrays.asList(split)));
    }
}
