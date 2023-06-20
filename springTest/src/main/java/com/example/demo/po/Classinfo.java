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
 * 
 * </p>
 *
 * @author 杨皓
 * @since 2022-10-14
 */
@Getter
@Setter
@ApiModel(value = "Classinfo对象", description = "")
public class Classinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("班级编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("班级名称：2019级软件工程1班")
    private String name;

    @ApiModelProperty("状态：1启用 0 不启用")
    private Integer state;

    @ApiModelProperty("学校")
    private String school;

    @ApiModelProperty("学院")
    private String depart;

    @ApiModelProperty("专业")
    private String major;


}
