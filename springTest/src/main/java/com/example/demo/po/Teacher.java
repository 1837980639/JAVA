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
@ApiModel(value = "Teacher对象", description = "")
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("用户编号")
    private Integer userId;

    @ApiModelProperty("学校")
    private String school;

    @ApiModelProperty("学院")
    private String depart;

    @ApiModelProperty("工号")
    private String teacherNo;

    private LocalDateTime createTime;

    @ApiModelProperty("职称，助教，讲师，副教授，教授")
    private String professional;

    private LocalDateTime updateTime;

    @ApiModelProperty("教师姓名")
    private String teacherName;


}
