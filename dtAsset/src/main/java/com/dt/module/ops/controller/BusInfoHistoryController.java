package com.dt.module.ops.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dt.core.annotion.Acl;
import com.dt.core.common.base.BaseController;
import com.dt.core.common.base.R;
import com.dt.core.tool.util.DbUtil;
import com.dt.module.ops.entity.BusInfo;
import com.dt.module.ops.entity.BusInfoHistory;
import com.dt.module.ops.service.BusInfoHistroyService;
import com.dt.module.ops.service.BusInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yh
 * @since 2023-03-21
 */
@RestController
@RequestMapping("/api/ops/busInfoHistory")
public class BusInfoHistoryController extends BaseController {

    @Autowired
    private BusInfoHistroyService busInfoHistroyService;

    @ResponseBody
    @Acl(info = "查询全部", value = Acl.ACL_ALLOW)
    @RequestMapping(value = "/get.do")
    public R selectPage(String start, String length, @RequestParam(value = "limit", required = true) String pageSize, @RequestParam(value = "page", required = true, defaultValue = "1") String pageIndex,String search) {
        JSONObject respar = DbUtil.formatPageParameter(start, length, pageSize, pageIndex);
        int pagesize = respar.getIntValue("pagesize");
        int pageindex = respar.getIntValue("pageindex");
        QueryWrapper<BusInfoHistory> wrapper = new QueryWrapper<>();
        wrapper.orderByAsc("busInfoId");
        IPage<BusInfoHistory> pdata = busInfoHistroyService.page(new Page<>(pageindex, pagesize),wrapper);

        JSONObject retrunObject = new JSONObject();
        retrunObject.put("code", 0);
        retrunObject.put("count", pdata.getTotal());
        retrunObject.put("data", JSONArray.parseArray(JSON.toJSONString(pdata.getRecords(), SerializerFeature.WriteDateUseDateFormat, SerializerFeature.DisableCircularReferenceDetect)));
        return R.clearAttachDirect(retrunObject);
    }
}
