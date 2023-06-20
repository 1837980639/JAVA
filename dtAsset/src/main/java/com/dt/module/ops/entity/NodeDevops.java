package com.dt.module.ops.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.*;
import com.dt.core.common.base.CustomDateSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.Serializable;
import java.util.Date;

/**
 * 运维管理实体类
 *
 * @author BladeX
 * @since 2023-03-03
 */

@TableName("ops_node_devops")
public class NodeDevops implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 事件编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 应用名称
     */
    @TableField("app_name")
    private String appName;
    /**
     * 所属平台
     */
    @TableField("platform")
    private String platform;
    /**
     * 事件类别
     */
    @TableField("category")
    private Integer category;
    /**
     * 事件来源
     */
    @TableField("event_source")
    private String eventSource;
    /**
     * 申告人
     */
    @TableField("claimant")
    private String claimant;

    /**
     * 事件描述
     */
    @TableField("event_description")
    private String eventDescription;
    /**
     * 创建时间
     */
    @TableField("creation_time")
    @JsonSerialize(using = CustomDateSerializer.class)
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date creationTime;
    /**
     * 结束时间
     */
    @TableField("end_time")
    @JsonSerialize(using = CustomDateSerializer.class)
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date endTime;
    /**
     * 处理经过
     */
    @TableField("treatment_process")
    private String treatmentProcess;
    /**
     * 处理人员
     */
    @TableField("processing_personnel")
    private String processingPersonnel;

    @TableField(exist=false)
    private String processingPersonnelStr;
    /**
     * 处理结果
     */
    @TableField("processing_results")
    private String processingResults;
    /**
     * 是否上报
     */
    @TableField("is_report")
    private Boolean isReport;
    /**
     * 发生时间
     */
    @TableField("occurrence")
    @JSONField(format="yyyy-MM-dd")
    private Date occurrence;
    /**
     * 备注
     */
    @TableField("bz")
    private String bz;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProcessingPersonnelStr() {
        return processingPersonnelStr;
    }

    public void setProcessingPersonnelStr(String processingPersonnelStr) {
        this.processingPersonnelStr = processingPersonnelStr;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getEventSource() {
        return eventSource;
    }

    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }

    public String getClaimant() {
        return claimant;
    }

    public void setClaimant(String claimant) {
        this.claimant = claimant;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getTreatmentProcess() {
        return treatmentProcess;
    }

    public void setTreatmentProcess(String treatmentProcess) {
        this.treatmentProcess = treatmentProcess;
    }

    public String getProcessingPersonnel() {
        return processingPersonnel;
    }

    public void setProcessingPersonnel(String processingPersonnel) {
        this.processingPersonnel = processingPersonnel;
    }

    public String getProcessingResults() {
        return processingResults;
    }

    public void setProcessingResults(String processingResults) {
        this.processingResults = processingResults;
    }

    public Boolean getIsReport() {
        return isReport;
    }

    public void setIsReport(Boolean isReport) {
        this.isReport = isReport;
    }

    public Date getOccurrence() {
        return occurrence;
    }

    public void setOccurrence(Date occurrence) {
        this.occurrence = occurrence;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }
}
