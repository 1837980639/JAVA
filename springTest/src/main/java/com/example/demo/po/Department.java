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
 * ����
 * </p>
 *
 * @author 杨皓
 * @since 2022-10-14
 */
@Getter
@Setter
@ApiModel(value = "Department对象", description = "����")
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("部门名称")
    private String departName;

    @ApiModelProperty("部门英文名称")
    private String departCode;

    @ApiModelProperty("部门描述")
    private String departDesc;

    @ApiModelProperty("学校id")
    private Integer schoolId;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    @ApiModelProperty("学院类型：学院|处室")
    private String departType;

    private Integer deleted;


}
