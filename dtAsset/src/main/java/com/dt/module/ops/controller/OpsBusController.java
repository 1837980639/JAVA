package com.dt.module.ops.controller;

import com.dt.core.annotion.Acl;
import com.dt.core.common.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/ops/test")
public class OpsBusController extends BaseController {
    @ResponseBody
    @Acl(info = "根据id查询详情信息", value = Acl.ACL_ALLOW)
    @RequestMapping(value = "/get")
    public int R(){
        return 133;
    }
}
