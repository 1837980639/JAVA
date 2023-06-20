package com.dt.module.ops.controller;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ObjectUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dt.core.annotion.Acl;
import com.dt.core.common.base.BaseController;
import com.dt.core.common.base.R;
import com.dt.core.tool.util.DbUtil;
import com.dt.core.tool.util.ToolUtil;
import com.dt.module.base.entity.SysUserInfo;
import com.dt.module.base.service.ISysUserInfoService;
import com.dt.module.ops.entity.NodeDevops;
import com.dt.module.ops.service.IDevOpsService;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lank
 * @since 2020-03-06
 */
@Controller
@RequestMapping("/api/ops/devOps")
public class DevOpsController extends BaseController {

    @Lazy
    @Resource
    private IDevOpsService iDevOpsService;
    @Lazy
    @Resource
    private ISysUserInfoService iSysUserInfoService;


    @ResponseBody
    @Acl(info = "根据id查询详情信息", value = Acl.ACL_ALLOW)
    @RequestMapping(value = "/getById.do")
    public R getById(@RequestParam(value = "id", required = true, defaultValue = "") String id) {
        return R.SUCCESS_OPER(iDevOpsService.getById(id));
    }

    @ResponseBody
    @Acl(info = "根据id查询详情信息", value = Acl.ACL_USER)
    @RequestMapping(value = "/test.do")
    public R getById2(@RequestParam(value = "id", required = true, defaultValue = "") String id) {
        return R.SUCCESS_OPER(iDevOpsService.getById(id));
    }

    @ResponseBody
    @Acl(info = "根据Id删除", value = Acl.ACL_USER)
    @RequestMapping(value = "/deleteById.do")
    public R deleteById(@RequestParam(value = "ids", required = true, defaultValue = "") String ids) {
        String[] split = ids.split(",");
        return R.SUCCESS_OPER(iDevOpsService.removeByIds(Arrays.asList(split)));
    }

    @ResponseBody
    @Acl(info = "表单提交", value = Acl.ACL_ALLOW)
    @RequestMapping(value = "/submit.do")
    public R submit(NodeDevops nodeDevops) {
        return R.SUCCESS_OPER(iDevOpsService.saveOrUpdate(nodeDevops));
    }

    @ResponseBody
    @Acl(info = "查询所有,有分页", value = Acl.ACL_ALLOW)
    @RequestMapping(value = "/selectPage.do")
    public R selectPage(String start, String length, @RequestParam(value = "limit", required = true, defaultValue = "10") String pageSize, @RequestParam(value = "page", required = true, defaultValue = "1") String pageIndex,String search) {
        JSONObject respar = DbUtil.formatPageParameter(start, length, pageSize, pageIndex);
        if (ToolUtil.isEmpty(respar)) {
            return R.FAILURE_REQ_PARAM_ERROR();
        }
        int pagesize = respar.getIntValue("pagesize");
        int pageindex = respar.getIntValue("pageindex");
        QueryWrapper<NodeDevops> ew = new QueryWrapper<>();
        if (ObjectUtil.isNotNull(search)){
            ew.like("app_name", search);
        }
//        ew.groupBy("processing_results");
        ew.orderByAsc("processingResults","processing_results");
        IPage<NodeDevops> pdata = iDevOpsService.page(new Page<>(pageindex, pagesize), ew);
        pdata.getRecords().forEach(data->{
            data.setProcessingPersonnelStr(userVo(data.getProcessingPersonnel()));
        });
        JSONObject retrunObject = new JSONObject();
        retrunObject.put("code", 0);
        retrunObject.put("count", pdata.getTotal());
        retrunObject.put("data", JSONArray.parseArray(JSON.toJSONString(pdata.getRecords(), SerializerFeature.WriteDateUseDateFormat, SerializerFeature.DisableCircularReferenceDetect)));
        return R.clearAttachDirect(retrunObject);
    }

    /**
     * 查询用户展示信息
     * @param str 待转换数据
     * @return 结果
     */
    public String userVo(String str){
        if (ObjectUtil.isEmpty(str)){
            return null;
        }
        LinkedList<String> userName = new LinkedList<>();
        String[] split = str.split(",");
        List<SysUserInfo> list = iSysUserInfoService.list(Wrappers.<SysUserInfo>query().lambda().in(SysUserInfo::getUserId, Arrays.asList(split)));
        list.forEach(item->{
            userName.add(item.getName());
        });
        return CollUtil.join(userName, ",");
    }
}

