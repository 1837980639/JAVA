package com.example.demo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 单个宿舍
 * </p>
 *
 * @author 杨皓
 * @since 2022-10-14
 */
@Getter
@Setter
@ApiModel(value = "Dormitory对象", description = "单个宿舍")
public class Dormitory implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("宿舍编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("宿舍名（前缀为楼编号）12栋：#12-A-101")
    private String name;

    @ApiModelProperty("宿舍长（空宿舍为null）")
    private Integer leader;

    @ApiModelProperty("总床位数")
    private Integer maxNumber;

    @ApiModelProperty("空位数")
    private Integer leftNumber;

    @ApiModelProperty("入住人数")
    private Integer liveNumber;

    @ApiModelProperty("空(0)学生入住(1)老师入住(2)废弃宿舍(3)")
    private Integer status;

    @ApiModelProperty("备注")
    private String comment;

    @ApiModelProperty("学校")
    private String school;

    @ApiModelProperty("宿舍类型（男寝：0，女寝：1）")
    private Integer type;

    @ApiModelProperty("建筑")
    private String building;


}
