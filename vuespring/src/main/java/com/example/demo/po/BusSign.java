package com.example.demo.po;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 登记表 跟踪流程
 * </p>
 *
 * @author 秦坤
 * @since 2023-03-24
 */
@Getter
@Setter
@TableName("bus_sign")
@ApiModel(value = "BusSign对象", description = "登记表 跟踪流程")
public class BusSign implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    private Integer id;

    @ApiModelProperty("项目编号")
    private String itemId;

    @ApiModelProperty("使用单位")
    private String useUnit;

    @ApiModelProperty("业务系统")
    private String busSystem;

    @ApiModelProperty("平台")
    private String platfrom;

    @ApiModelProperty("申请日期")
    private LocalDateTime applyTime;

    @ApiModelProperty("开通日期")
    private LocalDateTime openTime;

    @ApiModelProperty("应用单位是否签字")
    private String isUnitSign;

    @ApiModelProperty("应用单位是否盖章")
    private String isUnitSeal;

    @ApiModelProperty("经办审核是否签自")
    private String isHandleSign;

    @ApiModelProperty("领导是否签字")
    private String isLeaderSign;

    @ApiModelProperty("审批局是否盖章")
    private String isEaabSeal;

    @ApiModelProperty("是否计费")
    private String isBill;

    @ApiModelProperty("本周进展")
    private String progress;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("年份")
    private LocalDate year;

    @ApiModelProperty("逻辑删除")
    private Integer dr;


}
