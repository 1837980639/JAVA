package com.example.demo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author 杨皓
 * @since 2022-10-14
 */
@Getter
@Setter
@ApiModel(value = "Course对象", description = "")
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("课程名称")
    private String name;

    @ApiModelProperty("英文课程名称")
    private String nameEn;

    @ApiModelProperty("课程编号")
    private String courseNo;

    @ApiModelProperty("课程描述")
    private String description;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    @ApiModelProperty("院学")
    private String depart;

    @ApiModelProperty("状态 1激活 0 未激活")
    private Integer state;

    @ApiModelProperty("专业")
    private String major;

    private Integer deleted;

    @ApiModelProperty("课程类型:必修课,限选课,选修课,公共课,其他")
    private String courseType;

    @ApiModelProperty("学校")
    private String school;


}
