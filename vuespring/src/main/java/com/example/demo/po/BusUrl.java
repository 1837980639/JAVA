package com.example.demo.po;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 网站资源表
 * </p>
 *
 * @author 秦坤
 * @since 2023-03-24
 */
@Getter
@Setter
@TableName("bus_url")
@ApiModel(value = "BusUrl对象", description = "网站资源表")
public class BusUrl implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    @ApiModelProperty("项目编号")
    private String itemId;

    @ApiModelProperty("公告平台名称（同业务系统）")
    private String busSystem;

    @ApiModelProperty("管理单位（同使用单位）")
    private String useUnit;

    @ApiModelProperty("使用网络")
    private String useNetwork;

    @ApiModelProperty("访问网址")
    private String url;

    @ApiModelProperty("外部ip")
    private String outIp;

    @ApiModelProperty("内网地址")
    private String interIp;

    @ApiModelProperty("经办人")
    private String busHandle;

    @ApiModelProperty("联系方式")
    private Long handleTel;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("逻辑删除")
    private Integer dr;


}
