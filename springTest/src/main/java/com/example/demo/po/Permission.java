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
@ApiModel(value = "Permission对象", description = "")
public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("权限码")
    private String code;

    @ApiModelProperty("权限说明")
    private String description;

    @ApiModelProperty("访问地址")
    private String url;

    @ApiModelProperty("路径权限,按钮权限")
    private String type;

    @ApiModelProperty("权限类型：按钮权限，路径权限")
    private Integer deleted;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    @ApiModelProperty("父编号")
    private Integer pid;

    @ApiModelProperty("1 子权限 0无子权限")
    private Integer hasChildren;


}
