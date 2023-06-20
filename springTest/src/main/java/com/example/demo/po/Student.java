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
@ApiModel(value = "Student对象", description = "")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("用户编号，绑定用户")
    private Integer userId;

    @ApiModelProperty("学校")
    private String school;

    @ApiModelProperty("部门")
    private String depart;

    @ApiModelProperty("班级")
    private String classinfo;

    @ApiModelProperty("学号")
    private String studentNo;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    @ApiModelProperty("专业")
    private String major;

    @ApiModelProperty("学生姓名")
    private String studentName;


}
