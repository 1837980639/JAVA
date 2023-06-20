package com.dt.module.ops.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.dt.core.common.base.CustomDateSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author yh
 * @since 2023-03-21
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@TableName("bus_info")
public class BusInfo implements Serializable {

    private static final long serialVersionUID = 1L;

//    @ApiModelProperty("id")
    @TableId(value = "busInfoId", type = IdType.AUTO)
    private Integer busInfoId;

//    @ApiModelProperty("项目编号")
    private String itemId;

//    @ApiModelProperty("使用单位")
    private String useUnit;

//    @ApiModelProperty("盖章信息")
    private String sealInfo;

//    @ApiModelProperty("单位（以2023年为准）")
    private String unit;

//    @ApiModelProperty("类型")
    private String unitType;


    //    @ApiModelProperty("入云时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy")
    private LocalDate cloudTime;

//    @ApiModelProperty("业务系统")
    private String busSystem;

//    @ApiModelProperty("业务经办")
    private String busHandle;

//    @ApiModelProperty("联系方式")
    private Long handleTel;

//    @ApiModelProperty("业务技术支撑单位")
    private String busUnit;

//    @ApiModelProperty("是否再用")
    private String isUse;


//    @ApiModelProperty("备注")
    private String remark;
    @TableField("dr")
    private String isDelete;

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getBusInfoId() {
        return busInfoId;
    }

    public void setBusInfoId(Integer busInfoId) {
        this.busInfoId = busInfoId;
    }


    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getUseUnit() {
        return useUnit;
    }

    public void setUseUnit(String useUnit) {
        this.useUnit = useUnit;
    }

    public String getSealInfo() {
        return sealInfo;
    }

    public void setSealInfo(String sealInfo) {
        this.sealInfo = sealInfo;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public LocalDate getCloudTime() {
        return cloudTime;
    }

    public void setCloudTime(LocalDate cloudTime) {
        this.cloudTime = cloudTime;
    }

    public String getBusSystem() {
        return busSystem;
    }

    public void setBusSystem(String busSystem) {
        this.busSystem = busSystem;
    }

    public String getBusHandle() {
        return busHandle;
    }

    public void setBusHandle(String busHandle) {
        this.busHandle = busHandle;
    }

    public Long getHandleTel() {
        return handleTel;
    }

    public void setHandleTel(Long handleTel) {
        this.handleTel = handleTel;
    }

    public String getBusUnit() {
        return busUnit;
    }

    public void setBusUnit(String busUnit) {
        this.busUnit = busUnit;
    }

    public String getIsUse() {
        return isUse;
    }

    public void setIsUse(String isUse) {
        this.isUse = isUse;
    }


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "BusInfo{" +
                "busInfoId=" + busInfoId +
                ", itemId='" + itemId + '\'' +
                ", useUnit='" + useUnit + '\'' +
                ", sealInfo='" + sealInfo + '\'' +
                ", unit='" + unit + '\'' +
                ", unitType='" + unitType + '\'' +
                ", cloudTime=" + cloudTime +
                ", busSystem='" + busSystem + '\'' +
                ", busHandle='" + busHandle + '\'' +
                ", handleTel=" + handleTel +
                ", busUnit='" + busUnit + '\'' +
                ", isUse='" + isUse + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
