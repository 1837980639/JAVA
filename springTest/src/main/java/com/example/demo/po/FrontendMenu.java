package com.example.demo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("frontend_menu")
@ApiModel(value = "FrontendMenu对象", description = "")
public class FrontendMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("前端菜单名称")
    private String menuName;

    @ApiModelProperty("前端菜单访问HTML地址")
    private String menuUrl;

    @ApiModelProperty("父ID")
    private Integer pid;

    @ApiModelProperty("排序")
    private Integer menuSort;

    @ApiModelProperty("描述")
    private String description;

    @ApiModelProperty("是否有子菜单")
    private Integer hasChildren;


}
