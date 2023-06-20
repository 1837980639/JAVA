package com.example.demo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 业务单位信息表
 * </p>
 *
 * @author 秦坤
 * @since 2023-03-24
 */
@Getter
@Setter
@TableName("bus_info_history")
@ApiModel(value = "BusInfoHistory对象", description = "业务单位信息表")
public class BusInfoHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("历史表id")
    @TableId(value = "historyId", type = IdType.AUTO)
    private Integer historyId;

    @ApiModelProperty("项目编号")
    private String itemId;

    @ApiModelProperty("使用单位")
    private String useUnit;

    @ApiModelProperty("盖章信息")
    private String sealInfo;

    @ApiModelProperty("单位（以2023年为准）")
    private String unit;

    @ApiModelProperty("类型")
    private String unitType;

    @ApiModelProperty("入云时间")
    private LocalDate cloudTime;

    @ApiModelProperty("业务系统")
    private String busSystem;

    @ApiModelProperty("业务经办")
    private String busHandle;

    @ApiModelProperty("联系方式")
    private Long handleTel;

    @ApiModelProperty("业务技术支撑单位")
    private String busUnit;

    @ApiModelProperty("是否再用")
    private String isUse;

    @ApiModelProperty("逻辑删除")
    private Integer dr;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("busInfo_id")
    private Integer id;


}
